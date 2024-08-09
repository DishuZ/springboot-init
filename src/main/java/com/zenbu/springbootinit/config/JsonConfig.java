package com.zenbu.springbootinit.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * Spring MVC Json 配置
 *
 * @author <a href="https://github.com/DishuZ">Zenbu</a>
 * @from <a href="https://dishuz.github.io/blog/">Zenbu Space</a>
 */
@JsonComponent
public class JsonConfig {

    /**
     * 添加 Long 转 json 精度丢失的配置
     */
    @Bean
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        // 定义一个 ObjectMapper Bean，用于 JSON 序列化和反序列化
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
        // 创建一个 SimpleModule，并注册两个序列化器，将 Long 类型及其原始类型 long 在序列化为 JSON 时转换为字符串形式，以避免精度丢失问题
        SimpleModule module = new SimpleModule();
        module.addSerializer(Long.class, ToStringSerializer.instance);
        module.addSerializer(Long.TYPE, ToStringSerializer.instance);
        // 注册模块到 ObjectMapper 实例，并返回该实例供 Spring 框架使用
        objectMapper.registerModule(module);
        return objectMapper;
    }
}
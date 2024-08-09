package com.zenbu.springbootinit.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author <a href="https://github.com/DishuZ">Zenbu</a>
 * @from <a href="https://dishuz.github.io/blog/">Zenbu Space</a>
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
package com.zenbu.springbootinit.esdao;

import com.zenbu.springbootinit.model.dto.post.PostEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 帖子 ES 操作
 *
 * @author <a href="https://github.com/DishuZ">Zenbu</a>
 * @from <a href="https://dishuz.github.io/blog/">Zenbu Space</a>
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}
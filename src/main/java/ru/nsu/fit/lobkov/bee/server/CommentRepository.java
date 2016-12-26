package ru.nsu.fit.lobkov.bee.server;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Lobkov on 27.12.2016.
 */
public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findByProduct(@Param("product") Product product);
}

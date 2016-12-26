package ru.nsu.fit.lobkov.bee.server;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Lobkov on 27.12.2016.
 */
@RepositoryRestResource(collectionResourceRel = "category", path = "categories")
public interface CategoryRepository extends MongoRepository<Category, String> {
    Category findByName(@Param("name") String name);
}
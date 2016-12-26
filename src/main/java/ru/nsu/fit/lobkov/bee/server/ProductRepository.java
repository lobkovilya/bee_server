package ru.nsu.fit.lobkov.bee.server;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.io.PipedReader;
import java.util.List;

/**
 * Created by Lobkov on 27.12.2016.
 */
@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductRepository extends MongoRepository<Product, String>{
    List<Product> findByCategory(@Param("category") Category category);
    Product findByName(@Param("name") String name);
}

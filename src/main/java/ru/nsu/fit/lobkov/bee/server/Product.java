package ru.nsu.fit.lobkov.bee.server;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Created by Lobkov on 27.12.2016.
 */
public class Product {
    @Id
    public String id;
    @DBRef
    public Category category;
    public String name;
    public Double averageRate;

    public Product(Category category, String name, Double averageRate) {
        this.category = category;
        this.name = name;
        this.averageRate = averageRate;
    }

    public Product() {

    }
}

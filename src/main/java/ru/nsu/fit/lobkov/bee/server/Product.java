package ru.nsu.fit.lobkov.bee.server;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Created by Lobkov on 27.12.2016.
 */
public class Product {
    @Id
    public String id;
    public String categoryID;
    public String name;
    public Double averageRate;
    public String organisation;
    public String imageURL;

    public Product(String categoryID, String name, Double averageRate, String organisation, String imageURL) {
        this.categoryID = categoryID;
        this.name = name;
        this.averageRate = averageRate;
        this.organisation = organisation;
        this.imageURL = imageURL;
    }

    public Product() {

    }
}

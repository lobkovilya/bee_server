package ru.nsu.fit.lobkov.bee.server;

import org.springframework.data.annotation.Id;

/**
 * Created by Lobkov on 27.12.2016.
 */
public class Category {
    @Id
    public String id;
    public String name;

    public Category(String name) {
        this.name = name;
    }

    public Category() {

    }
}

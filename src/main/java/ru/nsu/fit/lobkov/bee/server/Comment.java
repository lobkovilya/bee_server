package ru.nsu.fit.lobkov.bee.server;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Created by Lobkov on 27.12.2016.
 */
public class Comment {
    @Id
    public String id;
    public String productID;
    public String text;
    public String userName;

    public Comment(String productID, String text, String userName) {
        this.productID = productID;
        this.text = text;
        this.userName = userName;
    }

    public Comment() {

    }
}

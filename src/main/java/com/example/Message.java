package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by qwj on 2017/10/12.
 */
@ConfigurationProperties(prefix = "message", locations = "classpath:jwt.properties")
public class Message {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

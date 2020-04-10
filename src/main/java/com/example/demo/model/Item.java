package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Item {
    private final UUID id;
    private final String name;
    private final int price;

    public Item(@JsonProperty("id") UUID id,
                @JsonProperty("name") String name,
                @JsonProperty("price") int price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public UUID getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
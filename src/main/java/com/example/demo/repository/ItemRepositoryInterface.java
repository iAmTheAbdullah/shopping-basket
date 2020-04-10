package com.example.demo.repository;

import com.example.demo.model.Item;

import java.util.UUID;

public interface ItemRepositoryInterface {
    boolean insertItem(UUID itemID, Item item);
    default boolean insertItem(Item item) {
        UUID id = UUID.randomUUID();

        return insertItem(id, item);
    }
}

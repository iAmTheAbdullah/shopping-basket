package com.example.demo.repository;

import com.example.demo.model.Item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeRepository")
public class ItemFakeRepository implements ItemRepositoryInterface {
    private static List<Item> DB = new ArrayList<>();

    @Override
    public boolean insertItem(UUID itemID, Item item) {
        return DB.add(new Item(itemID, item.getName(), item.getPrice()));
    }
}

package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepositoryInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private final ItemRepositoryInterface itemRepository;

    @Autowired
    public ItemService(@Qualifier("fakeRepository") ItemRepositoryInterface itemRepository) {
        this.itemRepository = itemRepository;
    }

    public boolean addItem(Item item) {
        return itemRepository.insertItem(item);
    }
}

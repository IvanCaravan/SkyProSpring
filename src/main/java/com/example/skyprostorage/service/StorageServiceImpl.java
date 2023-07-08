package com.example.skyprostorage.service;

import com.example.skyprostorage.Item.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class StorageServiceImpl implements StorageService {
    private final List<Item> items;

    public StorageServiceImpl() {
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Добавлено");
    }

    @Override
    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

}

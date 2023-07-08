package com.example.skyprostorage.service;

import com.example.skyprostorage.Item.Item;

import java.util.List;

public interface StorageService {

    void addItem(Item item);

    List<Item> getItems();
}

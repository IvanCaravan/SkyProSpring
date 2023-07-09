package com.example.skyprostorage.service;

import com.example.skyprostorage.Item.Item;

import java.util.List;

public interface StorageService {


    List<Integer> addItem(Integer... item);

    List<Integer> getItems();
}

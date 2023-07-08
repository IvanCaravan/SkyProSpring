package com.example.skyprostorage.controller;

import com.example.skyprostorage.Item.Item;
import com.example.skyprostorage.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class StorageController {

    private final StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @RequestMapping("/order/add")
    public String add(@RequestParam Integer Id) {
        return storageService.addItem(new Item(Id));
    }

    @RequestMapping("/order/get")
    public Collection<Item> get() {
        return storageService.getItems();
    }

}

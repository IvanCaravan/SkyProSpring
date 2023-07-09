package com.example.skyprostorage.controller;

import com.example.skyprostorage.Item.Item;
import com.example.skyprostorage.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StorageController {

    private final StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @RequestMapping("/order/add")
    public List<Integer> add(@RequestParam Integer... item) {

        return storageService.addItem(item);
    }

    @RequestMapping("/order/get")
    public List<Integer> get() {
        return storageService.getItems();
    }

}

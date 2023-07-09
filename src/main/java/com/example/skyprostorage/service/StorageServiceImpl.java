package com.example.skyprostorage.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class StorageServiceImpl implements StorageService {
    private final List<Integer> items = new ArrayList<>();


    @Override
    public List<Integer> addItem(Integer... item) {

        items.addAll(List.of(item));

        return List.of(item);
    }

    @Override
    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }

}

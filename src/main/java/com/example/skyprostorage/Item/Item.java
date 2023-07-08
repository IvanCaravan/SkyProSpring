package com.example.skyprostorage.Item;


import java.util.Objects;

public class Item {
    private final Integer Id;

    public Integer getId() {
        return Id;
    }

    public Item(Integer id) {
        this.Id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Id.equals(item.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Item{" +
                "Id=" + Id +
                '}';
    }
}

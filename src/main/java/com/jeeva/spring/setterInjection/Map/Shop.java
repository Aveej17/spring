package com.jeeva.spring.setterInjection.Map;

import java.util.Map;

public class Shop {
    private String name;
    private Map<Integer, String> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, String> getItems() {
        return items;
    }

    public void setItems(Map<Integer, String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "items=" + items +
                '}';
    }
}

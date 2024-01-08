package com.jeeva.spring.setterInjection.set;


import java.util.Set;

public class CarDealer {

    private String name;
    private Set<String> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getCars() {
        return cars;
    }

    public void setCars(Set<String> cars) {
        this.cars = cars;
    }
}

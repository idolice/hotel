package com.thoughtworks.hotel;

public class Hotel {
    private String name;
    private Price price;

    public Hotel(String name,Price price) {
        this.name = name;
        this.price=price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}

package com.thoughtworks.hotel;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class HotelReservation {

    private List<Hotel> hotels = new ArrayList<>();
    private List<Integer> prices = new ArrayList<>();

    public HotelReservation() {
        initHotelList();
    }

    public String reserve(Customer customer) {
        Calculator calculator = new Calculator();
        prices = hotels.stream().map(hotel -> calculator.calculate(hotel, customer)).collect(toList());
        int index=calculator.minIndex(prices);
        return hotels.get(index).getName();

    }

    private void initHotelList() {
        Price priceOfLakewood = new Price(110, 90, 80, 80);
        Price priceOfBridgewood = new Price(160, 60, 110, 50);
        Price priceOfRidgewood = new Price(220, 150, 100, 40);
        Hotel lakeWoodHotel = new Hotel("Lakewood", priceOfLakewood);
        Hotel bridgeWoodHotel = new Hotel("Bridgewood", priceOfBridgewood);
        Hotel ridgeWoodHotel = new Hotel("Ridgewood", priceOfRidgewood);
        hotels.add(lakeWoodHotel);
        hotels.add(bridgeWoodHotel);
        hotels.add(ridgeWoodHotel);
    }
}

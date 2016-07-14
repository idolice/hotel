package com.thoughtworks.hotel;

public class HotelReservation {
    public String reserve(Customer customer) {

        Hotel hotel = new Hotel();
        if (customer.getType() == "regular" && customer.getDate() == "weekday") {
            hotel.setName("Lakewood");
        }
        if (customer.getType() == "regular" && customer.getDate() == "weekend") {
            hotel.setName("Bridgewood");
        }
        if (customer.getType() == "reward" && customer.getDate() == "weekday") {
            hotel.setName("Lakewood");
        }
        if (customer.getType() == "reward" && customer.getDate() == "weekend") {
            hotel.setName("Ridgewood");
        }
        return hotel.getName();

    }
}

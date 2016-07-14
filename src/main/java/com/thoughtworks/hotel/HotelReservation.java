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
        return hotel.getName();

    }
}

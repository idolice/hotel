package com.thoughtworks.hotel;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HotelReservationTest {
    @Test
    public void should_return_cheapest_hotel_when_regular_customer_live_in_weekday() {
        // given

        // when
        HotelReservation hotelReservation = new HotelReservation();
        Customer customer = new Customer("regular", "weekday");
        String hotelName = hotelReservation.reserve(customer);
        // then
        assertThat(hotelName, is("Lakewood"));
    }

    @Test
    public void should_return_cheapest_hotel_when_regular_customer_live_in_weekend() {
        // given

        // when
        HotelReservation hotelReservation = new HotelReservation();
        Customer customer = new Customer("regular", "weekend");
        String hotelName = hotelReservation.reserve(customer);
        // then
        assertThat(hotelName, is("Bridgewood"));
    }

    @Test
    public void should_return_cheapest_hotel_when_reward_customer_live_in_weekday() {
        // given

        // when

        // then
    }
}

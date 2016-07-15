package com.thoughtworks.hotel;

import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HotelReservationTest {
    @Test
    public void should_find_cheapest_hotel_in_weekday_when_customer_is_regular() {
        // given

        // when
        HotelReservation hotelReservation = new HotelReservation();
        List<String> list= new ArrayList<>();
        list.add("weekday");
        Customer customer = new Customer("regular", list);
        String hotelName = hotelReservation.reserve(customer);
        // then
        assertThat(hotelName, is("Lakewood"));
    }

    @Test
    public void should_find_cheapest_hotel_in_weekend_when_customer_is_regular() {
        // given

        // when
        HotelReservation hotelReservation = new HotelReservation();
        List<String> list= new ArrayList<>();
        list.add("weekend");
        Customer customer = new Customer("regular", list);
        String hotelName = hotelReservation.reserve(customer);
        // then
        assertThat(hotelName, is("Bridgewood"));
    }

    @Test
    public void should_find_cheapest_hotel_in_weekday_when_customer_is_reward() {
        // given

        // when
        HotelReservation hotelReservation = new HotelReservation();
        List<String> list= new ArrayList<>();
        list.add("weekday");
        Customer customer = new Customer("reward", list);
        String hotelName = hotelReservation.reserve(customer);
        // then
        assertThat(hotelName, is("Lakewood"));
    }
    @Test
    public void should_find_cheapest_hotel_in_weekend_when_customer_is_reward() {
        // given

        // when
        HotelReservation hotelReservation = new HotelReservation();
        List<String> list= new ArrayList<>();
        list.add("weekend");
        Customer customer = new Customer("reward", list);
        String hotelName = hotelReservation.reserve(customer);
        // then
        assertThat(hotelName, is("Ridgewood"));
    }
    @Test
    public void should_find_cheapest_hotel_when_customer_is_reward() {
        // given

        // when
        HotelReservation hotelReservation = new HotelReservation();
        List<String> list= new ArrayList<>();
        list.add("weekday");
        list.add("weekend");
        Customer customer = new Customer("regular", list);
        String hotelName = hotelReservation.reserve(customer);
        // then
        assertThat(hotelName, is("Lakewood"));
    }
}

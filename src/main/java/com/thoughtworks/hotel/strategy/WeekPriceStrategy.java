package com.thoughtworks.hotel.strategy;

import com.thoughtworks.hotel.Hotel;

public class WeekPriceStrategy extends CalculateStrategy {
    @Override
    public int calculate(Hotel hotel, String type, String data) {
        if (data == "weekday") {
            return this.priceOfWeek;
        }
        return this.PriceOfWeekend;
    }
}

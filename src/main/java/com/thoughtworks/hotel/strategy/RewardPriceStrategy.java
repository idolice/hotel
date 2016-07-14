package com.thoughtworks.hotel.strategy;

import com.thoughtworks.hotel.Hotel;

public class RewardPriceStrategy extends CalculateStrategy {
    @Override
    public int calculate(Hotel hotel,String type, String data) {
        if (type=="reward"){
            getNextHandler().priceOfweek=hotel.getPrice().getRewardPriceAtWeekday();
            getNextHandler().PriceOfweekend =hotel.getPrice().getRewardPriceAtWeekend();
            return getNextHandler().calculate(hotel,type,data);
        }getNextHandler().priceOfweek=hotel.getPrice().getRegularPriceAtWeekday();
        getNextHandler().PriceOfweekend =hotel.getPrice().getRegularPriceAtWeekend();
        return getNextHandler().calculate(hotel,type,data);
    }
}

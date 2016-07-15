package com.thoughtworks.hotel.strategy;

import com.thoughtworks.hotel.Hotel;

public class RewardPriceStrategy extends CalculateStrategy {
    private void setPriceOfNextHandler(int priceOfWeek, int priceOfWeekend) {
        getNextHandler().priceOfWeek = priceOfWeek;
        getNextHandler().PriceOfWeekend = priceOfWeekend;
    }

    @Override
    public int calculate(Hotel hotel, String type, String data) {
        if (type == "reward") {
            setPriceOfNextHandler(hotel.getPrice().getRewardPriceAtWeekday(), hotel.getPrice().getRewardPriceAtWeekend());
            return getNextHandler().calculate(hotel, type, data);
        }
        setPriceOfNextHandler(hotel.getPrice().getRegularPriceAtWeekday(), hotel.getPrice().getRegularPriceAtWeekend());
        return getNextHandler().calculate(hotel, type, data);
    }
}

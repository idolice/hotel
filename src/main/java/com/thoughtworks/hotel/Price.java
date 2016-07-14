package com.thoughtworks.hotel;

public class Price {
    private int regularPriceAtWeekday;
    private int regularPriceAtWeekend;
    private int rewardPriceAtWeekday;
    private int rewardPriceAtWeekend;

    public Price(int regularPriceAtWeekday, int regularPriceAtWeekend, int rewardPriceAtWeekday, int rewardPriceAtWeekend) {
        this.regularPriceAtWeekday = regularPriceAtWeekday;
        this.regularPriceAtWeekend = regularPriceAtWeekend;
        this.rewardPriceAtWeekday = rewardPriceAtWeekday;
        this.rewardPriceAtWeekend = rewardPriceAtWeekend;
    }
}

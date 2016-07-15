package com.thoughtworks.hotel.factory;

import com.thoughtworks.hotel.strategy.CalculateStrategy;
import com.thoughtworks.hotel.strategy.RewardPriceStrategy;
import com.thoughtworks.hotel.strategy.WeekPriceStrategy;

public class StrategyFactory {
    public CalculateStrategy getStrategy(){
        RewardPriceStrategy rewardPriceStrategy=new RewardPriceStrategy();
        WeekPriceStrategy weekPriceStrategy=new WeekPriceStrategy();
        rewardPriceStrategy.setNextHandler(weekPriceStrategy);
        return rewardPriceStrategy;
    }
}

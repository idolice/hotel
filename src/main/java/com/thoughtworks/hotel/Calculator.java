package com.thoughtworks.hotel;

import com.thoughtworks.hotel.factory.StrategyFactory;
import com.thoughtworks.hotel.strategy.CalculateStrategy;

import java.util.List;

public class Calculator {

    public int calculate(Hotel hotel, Customer customer) {
        List<String> list = customer.getDateList();
        int price=0;
        for (int i = 0; i < list.size(); i++) {
            String tempData = list.get(i);
            StrategyFactory strategyFactory=new StrategyFactory();
            CalculateStrategy calculateStrategy=strategyFactory.getStrategy();
            price+=calculateStrategy.calculate(hotel,customer.getType(),tempData);

        }
        return price;
    }

    public int minIndex(List<Integer> list){
        int temp=list.stream().min(Integer::compareTo).get();
        return list.indexOf(temp);
    }
}

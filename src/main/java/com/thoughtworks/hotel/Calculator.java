package com.thoughtworks.hotel;

import java.util.List;

public class Calculator {

    public int calculate(Hotel hotel, Customer customer) {
        List<String> list = customer.getDateList();
        for (int i = 0; i < list.size(); i++) {
            String tempData = list.get(i);
            return 1;
        }
    }
}

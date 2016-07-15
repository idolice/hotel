package com.thoughtworks.hotel;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String type;

    private List<String> dateList=new ArrayList<>();


    public Customer(String type, List<String> dateList) {
        this.type = type;
        this.dateList = dateList;
    }

    public List<String> getDateList() {
        return dateList;
    }

    public void setDateList(List<String> dateList) {
        this.dateList = dateList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}

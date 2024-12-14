package com.shrayansh.model;

import java.util.Map;

public class Cart {
    private int id;
    private Map<Integer,Integer> categoryIdVsCount;

    public Cart(Map<Integer, Integer> categoryIdVsCount) {
        this.categoryIdVsCount = categoryIdVsCount;
        //if want we can remove this products from overall inventory as well.
    }

    public void clear() {
        this.categoryIdVsCount.clear();
    }
}

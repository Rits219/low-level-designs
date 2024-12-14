package com.shrayansh.model;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, Integer> productCategoryIdVsCount;
    private Map<Integer,ProductCategory> productCategoryMap;

    public Inventory() {
        this.productCategoryIdVsCount = new HashMap<>();
    }

    public void addProduct(Map<Integer, Integer> productCategoryIdVsCount) {
        for (Map.Entry<Integer, Integer> entry : productCategoryIdVsCount.entrySet()) {
            int categoryId = entry.getKey();
            int count = entry.getValue();
            if (this.productCategoryIdVsCount.containsKey(categoryId)) {
                this.productCategoryIdVsCount.put(categoryId, this.productCategoryIdVsCount.get(categoryId) + count);
            } else {
                this.productCategoryIdVsCount.put(categoryId, count);
            }
        }
    }

    public void removeProduct(Map<Integer, Integer> productCategoryIdVsCount){
        for (Map.Entry<Integer, Integer> entry : productCategoryIdVsCount.entrySet()) {
            int categoryId = entry.getKey();
            int count = entry.getValue();
            if (this.productCategoryIdVsCount.containsKey(categoryId)) {
                this.productCategoryIdVsCount.put(categoryId, this.productCategoryIdVsCount.get(categoryId) - count);
            }
        }
    }

    public void show() {
        for (Map.Entry<Integer, Integer> entry : this.productCategoryIdVsCount.entrySet()) {
            System.out.println("Category Id: " + entry.getKey() + " Count: " + entry.getValue());
        }
    }
}

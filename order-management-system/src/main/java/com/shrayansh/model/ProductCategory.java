package com.shrayansh.model;

import java.util.ArrayList;
import java.util.List;

//grouping the list of products based on the price.
public class ProductCategory {
    private int id;
    private List<Product> productList;
    private double price;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductCategory(double price,List<Product> productList) {
        this.id = Util.getRandomId();
        this.price = price;
        this.productList = productList;
    }
}

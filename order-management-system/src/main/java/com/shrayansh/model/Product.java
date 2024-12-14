package com.shrayansh.model;

public class Product {
    private int id;
    private String name;
//    private Date expiryDate;
//    private Date manufacturdDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String name){
        this.id = Util.getRandomId();
        this.name = name;
    }
}

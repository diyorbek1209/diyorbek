package org.example.model;

public class Basket {
    private int products;
    private String name;
    private double totalPrice;
    private String type;
    private String item;

    public int getProducts() {
        return products;
    }

    public void setProducts(int products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getId() {
        return products;
    }

    public void setId(int id) {
        this.products = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPicture() {
        return item;
    }

    public void setPicture(String picture) {
        this.item = picture;
    }

    public Basket(int products, String name, double totalPrice, String type, String item) {
        this.products = products;
        this.name = name;
        this.totalPrice = totalPrice;
        this.type = type;
        this.item = item;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                ", name='" + name + '\'' +
                ", totalPrice=" + totalPrice +
                ", type='" + type + '\'' +
                ", item='" + item + '\'' +
                '}';
    }
}
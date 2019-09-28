package com.abc;

// ---------------------
// 產品類別
// ---------------------
public class Product {
    // 成員
    private String name;       // 名稱
    private int price;         // 定價
    private int specialPrice;  // 特價

    // 建構元
    public Product(String name, int price, int specialPrice) {
        this.name = name;
        this.price = price;
        this.specialPrice = specialPrice;
    }

    // 建構元
    public Product() {
        this.name = null;
        this.price = 0;
        this.specialPrice = 0;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSpecialPrice(int specialPrice) {
        this.specialPrice = specialPrice;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getSpecialPrice() {
        return this.specialPrice;
    }
}
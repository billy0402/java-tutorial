package com.abc;

public class Order {
    // 成員
    private String name;      // 產品名稱
    private int subtotal;        // 小計金額


    // 建構元
    public Order(String name, int subtotal) {
        this.name = name;
        this.subtotal = subtotal;
    }

    // 建構元
    public Order() {
        this.name = null;
        this.subtotal = 0;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }


    // getters
    public String getName() {
        return this.name;
    }

    public int getSubtotal() {
        return this.subtotal;
    }

}
package com.abc;

public class Transaction {
    // 成員
    private String date;     // 交易日期
    private String cusName;      // 客戶姓名
    private String item;        // 商品名稱
    private int amount;        // 購買數量

    // 建構元
    public Transaction(String date, String cusName, String item, int amount) {
        this.date = date;
        this.cusName = cusName;
        this.item = item;
        this.amount = amount;
    }

    // 建構元
    public Transaction() {
        this.date = null;
        this.cusName = null;
        this.item = null;
        this.amount = 0;
    }

    // setters
    public void setDate(String date) {
        this.date = date;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // getters
    public String getDate() {
        return this.date;
    }

    public String getCusName() {
        return this.cusName;
    }

    public String getItem() {
        return this.item;
    }

    public int getAmount() {
        return this.amount;
    }

    // ----------------------------
}
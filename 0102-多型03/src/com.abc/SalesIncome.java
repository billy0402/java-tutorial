package com.abc;

public class SalesIncome extends Income {
    private int price;   // 單價
    private int amount;  // 數量

    // 建構元(1)
    public SalesIncome(String date, String title, String empName, int price, int amount) {
        super(date, title, empName);
        this.price = price;
        this.amount = amount;
    }

    // 建構元(2)
    public SalesIncome() {
    }

    // getters
    public int getPrice() {
        return this.price;
    }

    public int getAmount() {
        return this.amount;
    }

    // setters
    public void setPrice(int price) {
        this.price = price;
    }

    public void setAMount(int amount) {
        this.amount = amount;
    }
    // 計算總金額

    @Override
    public int total() {
        double salesAmount = price * amount;
        if (salesAmount >= 30000) {
            return (int) (salesAmount * 0.85);
        } else if (salesAmount >= 20000 && salesAmount < 30000) {
            return (int) (salesAmount * 0.95);
        } else {
            return (int) (salesAmount);
        }
    }
}
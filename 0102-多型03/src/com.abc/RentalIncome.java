package com.abc;

public class RentalIncome extends Income {
    private int price;   // 租金
    private int tax;     // 稅金

    // 建構元(1)
    public RentalIncome(String date, String title, String empName, int price, int tax) {
        super(date, title, empName); // 呼叫父親的建構元
        this.price = price;
        this.tax = tax;
    }

    // 建構元(2)
    public RentalIncome() {
    }

    // setter
    public void setPrice(int price) {
        this.price = price;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    // getter
    public int getPrice() {
        return price;
    }

    public int getTax() {
        return tax;
    }

    // 計算總金額    
    @Override
    public int total() {
        return price - tax;
    }
}
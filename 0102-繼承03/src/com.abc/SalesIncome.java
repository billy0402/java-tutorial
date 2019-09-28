/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author USER
 */

package com.abc;

public class SalesIncome extends Income {
    private int price;   // 單價
    private int amount;  // 數量

    // 建構元(1)	
    public SalesIncome(String date, String title, String empName, int price, int amount) {
        super(date, title, empName); // 呼叫父親的建構元
        this.price = price;
        this.amount = amount;
    }

    // 建構元(2)
    public SalesIncome() {
    }

    // 設定成員值, setter
    public void setPrice(int price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // 取出成員值, getter
    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }


    // 計算總金額(未完成)
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
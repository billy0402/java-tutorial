package com.abc;

public class Customer {
    private String name;
    private int money;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public int getMoney() {
        return this.money;
    }

    // 把身上的錢扣掉 amount
    public void spendMoney(int amount) {
        this.money = this.money - amount;
    }
}
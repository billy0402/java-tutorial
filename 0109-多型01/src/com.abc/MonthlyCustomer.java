package com.abc;

public class MonthlyCustomer extends Customer {
    private int baseFee;      // 月租費
    private int freeMinutes;  // 免費通話分鐘數

    // 建構元(1)	
    public MonthlyCustomer(String type, String phoneNo, String name, int minutes, int baseFee, int freeMinutes) {
        super(type, phoneNo, name, minutes); // 呼叫父親的建構元;
        this.baseFee = baseFee;
        this.freeMinutes = freeMinutes;
    }

    // 建構元(2)
    public MonthlyCustomer() {
    }

    // setters
    public void setBaseFee(int baseFee) {
        this.baseFee = baseFee;
    }

    public void setFreeMinutes(int freeMinutes) {
        this.freeMinutes = freeMinutes;
    }

    // getters
    public int getBaseFee() {
        return this.baseFee;
    }

    public int getFreeMinutes() {
        return this.freeMinutes;
    }

    // ---------------------------------	
    // 月租型通話費
    // ---------------------------------
    @Override
    public int fee() {
        if (minutes - freeMinutes > 0) {
            return (int) (baseFee + 5.6 * (minutes - freeMinutes));
        } else {
            return baseFee;
        }
    }
    // ---------------------------------    
}
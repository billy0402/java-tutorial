// ------------------------------------------------------
// 月租型客戶 (兒子, 繼承了客戶類別, 未完成)
// ------------------------------------------------------

package com.abc;

public class MonthlyCustomer extends Customer {
    private int baseFee;      // 月租費
    private int freeMinutes;  // 免費通話分鐘數

    // 建構元(1)
    public MonthlyCustomer(String type, String phoneNo, String name, int minutes, int baseFee, int freeMinutes) {
        super(type, phoneNo, name, minutes); // 呼叫父親的建構元
        this.baseFee = baseFee;
        this.freeMinutes = freeMinutes;
    }

    // 建構元(2)
    public MonthlyCustomer() {
    }

    // 設定成員值, setter
    public void setBaseFee(int baseFee) {
        this.baseFee = baseFee;
    }

    public void setFreeMinutes(int freeMinutes) {
        this.freeMinutes = freeMinutes;
    }


    // 取出成員值, getter
    public int getBaseFee() {
        return baseFee;
    }

    public int getFreeMinutes() {
        return freeMinutes;
    }

    // ---------------------------------	
    // 月租型通話費
    // ---------------------------------
    @Override
    public int fee() {
        int overfee = 0;
        if (minutes - freeMinutes > 0) {
            overfee = minutes - freeMinutes;
        }
        return baseFee + (int) (overfee * 5.6);
    }
    // ---------------------------------    
}
// ------------------------------------------------------
// 易付卡型客戶 (兒子, 繼承了客戶類別, 未完成)
// ------------------------------------------------------

package com.abc;

public class MeteredCustomer extends Customer {
    // 建構元(1)
    public MeteredCustomer(String type, String phoneNo, String name, int minutes) {
        super(type, phoneNo, name, minutes); // 呼叫父親的建構元
    }

    // 建構元(2)
    public MeteredCustomer() {
    }

    // ---------------------------------	
    // 易付卡型通話費
    // ---------------------------------
    @Override
    public int fee() {
        return (int) (minutes * 8.7);
    }
    // --------------------------------- 
}
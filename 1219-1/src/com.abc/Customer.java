// ------------------------------------------------------
// 客戶 (父親, 抽象類別, 已完成)
// ------------------------------------------------------

package com.abc;

public abstract class Customer {
    private String type;        // 型別
    private String phoneNo;     // 電話號碼
    private String name;        // 姓名
    int minutes;        // 本月通話分鐘數   

    // 建構元(1)
    public Customer(String type, String phoneNo, String name, int minutes) {
        this.type = type;
        this.phoneNo = phoneNo;
        this.name = name;
        this.minutes = minutes;
    }

    // 建構元(2)
    public Customer() {
    }

    // setters
    public void setType(String type) {
        this.type = type;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    // getters
    public String getType() {
        return this.type;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public String getName() {
        return this.name;
    }

    public int getMinutes() {
        return this.minutes;
    }

    // ---------------------------------	
    // 通話費, 抽象方法
    // ---------------------------------
    abstract public int fee();
    // ---------------------------------      
}
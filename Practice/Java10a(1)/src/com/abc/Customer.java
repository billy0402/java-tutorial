package com.abc;

public class Customer {
    // 成員
    private String cusName;     // 客戶姓名
    private String tel;      // 電話號碼
    private String address;        // 地址    

    // 建構元
    public Customer(String cusName, String tel, String address) {
        this.cusName = cusName;
        this.tel = tel;
        this.address = address;
    }

    // 建構元
    public Customer() {
        this.cusName = null;
        this.tel = null;
        this.address = null;
    }

    // setters
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // getters
    public String getCusName() {
        return this.cusName;
    }

    public String getTel() {
        return this.tel;
    }

    public String getAddress() {
        return this.address;
    }

    // ----------------------------
}
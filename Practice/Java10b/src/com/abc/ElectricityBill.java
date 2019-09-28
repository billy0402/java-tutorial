package com.abc;

public class ElectricityBill {
    // 成員
    private String cusName;     // 用戶名稱
    private Boolean isBusiness;      // 是否營業用電
    private Boolean isSummer;        // 是否夏月用電
    private int degree;        // 用電度數


    // 建構元
    public ElectricityBill(String cusName, Boolean isBusiness, Boolean isSummer, int degree) {
        this.cusName = cusName;
        this.isBusiness = isBusiness;
        this.isSummer = isSummer;
        this.degree = degree;

    }

    // 建構元
    public ElectricityBill() {
        this.cusName = null;
        this.isBusiness = true;
        this.isSummer = true;
        this.degree = 0;
    }

    // setters
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setIsBusiness(Boolean isBusiness) {
        this.isBusiness = isBusiness;
    }

    public void setIsSummer(Boolean isSummer) {
        this.isSummer = isSummer;
    }

    public void degree(int degree) {
        this.degree = degree;
    }

    // getters
    public String getCusName() {
        return this.cusName;
    }

    public Boolean getIsBusiness() {
        return this.isBusiness;
    }

    public Boolean getIsSummer() {
        return this.isSummer;
    }

    public int degree() {
        return this.degree;
    }

    // 計算電費
    public int fee() {
        double fee = 0;

        if (this.isBusiness == true) {
            if (this.isSummer == true) {
                if (this.degree < 330) {
                    fee = this.degree * 3.76;
                } else if (this.degree > 330 && this.degree <= 700) {
                    fee = 330 * 3.76 + (this.degree - 330) * 4.62;
                } else if (this.degree > 700 && this.degree <= 1500) {
                    fee = 330 * 3.76 + 370 * 4.62 + (this.degree - 700) * 5.48;
                } else {
                    fee = 330 * 3.76 + 370 * 4.62 + 800 * 5.48 + (this.degree - 1500) * 6.73;
                }
            } else {
                if (this.degree < 330) {
                    fee = this.degree * 3.02;
                } else if (this.degree > 330 && this.degree <= 700) {
                    fee = 330 * 3.02 + (this.degree - 330) * 3.68;
                } else if (this.degree > 700 && this.degree <= 1500) {
                    fee = 330 * 3.02 + 370 * 3.68 + (this.degree - 700) * 4.31;
                } else {
                    fee = 330 * 3.02 + 370 * 3.68 + 800 * 4.31 + (this.degree - 1500) * 5.31;
                }
            }
        } else {
            if (this.isSummer == true) {
                if (this.degree < 120) {
                    fee = this.degree * 2.1;
                } else if (this.degree > 120 && this.degree <= 330) {
                    fee = 120 * 2.1 + (this.degree - 120) * 3.02;
                } else if (this.degree > 330 && this.degree <= 500) {
                    fee = 120 * 2.1 + 210 * 3.02 + (this.degree - 330) * 4.39;
                } else if (this.degree > 500 && this.degree <= 700) {
                    fee = 120 * 2.1 + 210 * 3.02 + 170 * 4.39 + (this.degree - 500) * 5.44;
                } else if (this.degree > 700 && this.degree <= 1000) {
                    fee = 120 * 2.1 + 210 * 3.02 + 170 * 4.39 + 200 * 5.44 + (this.degree - 700) * 6.16;
                } else {
                    fee = 120 * 2.1 + 210 * 3.02 + 170 * 4.39 + 200 * 5.44 + 300 * 6.16 + (this.degree - 1000) * 6.71;
                }
            } else {
                if (this.degree < 120) {
                    fee = this.degree * 2.1;
                } else if (this.degree > 120 && this.degree <= 330) {
                    fee = 120 * 2.1 + (this.degree - 120) * 3.68;
                } else if (this.degree > 330 && this.degree <= 500) {
                    fee = 120 * 2.1 + 210 * 3.68 + (this.degree - 330) * 3.61;
                } else if (this.degree > 500 && this.degree <= 700) {
                    fee = 120 * 2.1 + 210 * 3.68 + 170 * 3.61 + (this.degree - 500) * 4.48;
                } else if (this.degree > 700 && this.degree <= 1000) {
                    fee = 120 * 2.1 + 210 * 3.68 + 170 * 3.61 + 200 * 4.48 + (this.degree - 700) * 5.03;
                } else {
                    fee = 120 * 2.1 + 210 * 3.68 + 170 * 3.61 + 200 * 4.48 + 300 * 5.03 + (this.degree - 1000) * 5.28;
                }
            }
        }

        return (int) fee;
    }
    // ----------------------------
}
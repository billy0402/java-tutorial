package com.abc;

public class Course {
    // 成員
    private String crsName;
    private double crsCredit;

    // 建構元
    public Course(String crsName, double crsCredit) {
        this.crsName = crsName;
        this.crsCredit = crsCredit;
    }

    public Course() {
        this.crsName = null;
        this.crsCredit = 0;
    }

    // getter
    public String getCrsName() {
        return this.crsName;
    }

    public double getCrsCredit() {
        return this.crsCredit;
    }

    // setter void << 沒有
    public void setCrsName(String crsName) {
        this.crsName = crsName;
    }

    public void setCrsCredit(double crsCredit) {
        this.crsCredit = crsCredit;
    }
}

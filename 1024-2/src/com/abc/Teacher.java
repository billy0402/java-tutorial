package com.abc;

public class Teacher {
    // 成員
    private String tchName;
    private String department;

    // 建構元
    public Teacher(String tchName, String department) {
        this.tchName = tchName;
        this.department = department;
    }

    public Teacher() {
        this.tchName = null;
        this.department = null;
    }

    // getter
    public String getTchName() {
        return this.tchName;
    }

    public String getDepartment() {
        return this.department;
    }

    // setter void << 沒有
    public void setTchName(String tchName) {
        this.tchName = tchName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

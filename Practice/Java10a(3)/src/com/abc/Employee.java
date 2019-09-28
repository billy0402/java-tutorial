package com.abc;

public class Employee {
    // 成員
    private String empNo;     // 員工編號
    private String empName;      // 員工姓名
    private int baseSalary;        // 底薪    
    private int overHours;    // 本月加班時數

    // 建構元
    public Employee(String empNo, String empName, int baseSalary, int overHours) {
        this.empNo = empNo;
        this.empName = empName;
        this.baseSalary = baseSalary;
        this.overHours = overHours;
    }

    // 建構元
    public Employee() {
        this.empNo = null;
        this.empName = null;
        this.baseSalary = 0;
        this.overHours = 0;
    }

    // setters
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setOverHours(int overHours) {
        this.overHours = overHours;
    }

    // getters
    public String getEmpNo() {
        return this.empNo;
    }

    public String getEmpName() {
        return this.empName;
    }

    public int getBaseSalary() {
        return this.baseSalary;
    }

    public int getOverHours() {
        return this.overHours;
    }

    // 計算薪水總額的方法---------------   
    public int totalSalary() {
        return this.baseSalary + 180 * this.overHours;
    }
    // ----------------------------
}
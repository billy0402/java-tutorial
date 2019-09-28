package com.abc;

public class Employee {
    // 成員
    private String empNo;     // 編號
    private String name;      // 姓名
    private char rank;        // 職等
    private int seniority;    // 年資
    private int overHours;    // 加班時數

    // 建構元
    public Employee(String empNo, String name, char rank, int seniority, int overHours) {
        this.empNo = empNo;
        this.name = name;
        this.rank = rank;
        this.seniority = seniority;
        this.overHours = overHours;
    }

    // 建構元
    public Employee() {
        this.empNo = null;
        this.name = null;
        this.rank = ' ';
        this.seniority = 0;
        this.overHours = 0;
    }

    // setters
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public void setOverHours(int overHours) {
        this.overHours = overHours;
    }

    // getters
    public String getEmpNo() {
        return this.empNo;
    }

    public String getName() {
        return this.name;
    }

    public char getRank() {
        return this.rank;
    }

    public int getSeniority() {
        return this.seniority;
    }

    public int getOverHours() {
        return this.overHours;
    }

    // 計算薪水的方法---------------
    public int salary() {
        int baseSalary, overTimePay;  // 底薪, 每小時加班費

        if (this.rank == 'A') {
            baseSalary = 40000;
            overTimePay = 280;
        } else if (this.rank == 'B') {
            baseSalary = 36000;
            overTimePay = 230;
        } else {
            baseSalary = 30000;
            overTimePay = 180;
        }

        return baseSalary + overTimePay * this.overHours;
    }

    // 計算年終的方法--------------
    public double month() {
        double m = 0;

        if (this.seniority >= 10) {
            m = 3.5;
        } else if (this.seniority >= 5 && this.seniority < 10) {
            m = 2;
        } else {
            m = 1;
        }

        return m;
    }
    // ----------------------------
}

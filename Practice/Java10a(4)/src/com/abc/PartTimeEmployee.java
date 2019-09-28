package com.abc;

public class PartTimeEmployee {
    // 成員
    private String empNo;     // 員工編號
    private String empName;      // 員工姓名
    private int workHours;        // 本月上班時數

    // 建構元
    public PartTimeEmployee(String empNo, String empName, int workHours) {
        this.empNo = empNo;
        this.empName = empName;
        this.workHours = workHours;
    }

    // 建構元
    public PartTimeEmployee() {
        this.empNo = null;
        this.empName = null;
        this.workHours = 0;
    }

    // setters
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    // getters
    public String getEmpNo() {
        return this.empNo;
    }

    public String getEmpName() {
        return this.empName;
    }

    public int getWorkHours() {
        return this.workHours;
    }

    // 薪水總額
    public int totalSalary() {
        int ts = 0;

        if (this.empNo.substring(0, 2).equals("HR")) {
            ts = 350;
        } else if (this.empNo.substring(0, 2).equals("AC")) {
            ts = 330;
        } else if (this.empNo.substring(0, 2).equals("TR")) {
            ts = 370;
        } else {
            ts = 300;
        }

        return ts;
    }
    // ----------------------------
}
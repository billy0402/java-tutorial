package com.abc;

// ------------------------------------------------------
// 「外國員工」繼承「員工」, 因此宣告 extends 父親類別
// ------------------------------------------------------
public class ForeignEmployee extends Employee {
    private String area;  // 月銷售額

    // 建構元(1)	
    public ForeignEmployee(String empNo, String empName, char rank, String area) {
        super(empNo, empName, rank); // 呼叫父親的建構元
        this.area = area;
    }

    // 建構元(2)
    public ForeignEmployee() {
    }

    // 設定成員值, setter
    public void setArea(String area) {
        this.area = area;
    }

    // 取出成員值, getter
    public String getArea() {
        return area;
    }

    // -------------------------------------------
    // 外國員工計算薪水的方法, 實作父親的抽象方法
    // -------------------------------------------
    @Override
    public int salary() {
        int s = 0;
        switch (this.getArea()) {
            case "北京":
                s = 70000;
                break;
            case "上海":
                s = 68000;
                break;
            case "北美":
                s = 75000;
                break;
            default:
                break;
        }
        return s;
    }
    // -------------------------------------------------------------    
}
package com.abc;

public class GEPTstudent extends Student {
    // 成員
    private String gept;   // 全民英檢級數

    // 建構元(1)	
    public GEPTstudent(String stuNo, String gender, int chi, int eng, int mat, int soc, int nat, int lec, String gept) {
        super(stuNo, gender, chi, eng, mat, soc, nat, lec); // 呼叫父親的建構元
        this.gept = gept;
    }

    // 建構元(2)
    public GEPTstudent() {
    }

    // 設定成員值, setter
    public void setGEPT(String gept) {
        this.gept = gept;
    }

    // 取出成員值, getter
    public String getGEPT() {
        return gept;
    }

    // 計算總分
    @Override
    public double total() {
        switch (gept) {
            case "初級":
                return super.total() + 60;
            case "中級":
                return super.total() + 80;
            case "中高級":
                return super.total() + 100;
            default:
                return super.total();
        }
    }
}
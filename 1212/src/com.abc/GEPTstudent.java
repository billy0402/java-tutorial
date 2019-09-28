package com.abc;

public class GEPTstudent extends Student {
    // 成員
    private String gept;

    // 建構元(1)
    public GEPTstudent(String stuNo, String gender, int chi, int eng, int mat, int soc, int nat, int lec, String gept) {
        super(stuNo, gender, chi, eng, mat, soc, nat, lec);
        this.gept = gept;
    }

    // 建構元(2)
    public GEPTstudent() {
    }

    // setters
    public void setGept(String gept) {
        this.gept = gept;
    }

    // getters
    public String getGept() {
        return this.gept;
    }

    // ------------------------------------------------------------------
    // 計算總分
    // ------------------------------------------------------------------

    @Override
    public double total() {
        switch (this.gept) {
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
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 計算平均
    // ------------------------------------------------------------------
    @Override
    public double average() {
        return total() / 10;
    }
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 計算滿分
    // ------------------------------------------------------------------
    @Override
    public int perfect() {
        int cnt = 0;
        if ("中高級".equals(this.gept)) {
            cnt = 1;
        }
        return super.perfect() + cnt;
    }
}
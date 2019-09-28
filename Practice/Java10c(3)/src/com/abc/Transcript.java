package com.abc;

public class Transcript {
    // 成員
    private String stuNo;     // 學號
    private String name;      // 姓名
    private int chi;        // 國文
    private int eng;      // 英文
    private int mat;        // 數學

    // 建構元
    public Transcript(String stuNo, String name, int chi, int eng, int mat) {
        this.stuNo = stuNo;
        this.name = name;
        this.chi = chi;
        this.eng = eng;
        this.mat = mat;
    }

    // 建構元
    public Transcript() {
        this.stuNo = null;
        this.name = null;
        this.chi = 0;
        this.eng = 0;
        this.mat = 0;
    }

    // setters
    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChi(int chi) {
        this.chi = chi;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    // getters
    public String getStuNo() {
        return this.stuNo;
    }

    public String getName() {
        return this.name;
    }

    public int getChi() {
        return this.chi;
    }

    public int getEng() {
        return this.eng;
    }

    public int getMat() {
        return this.mat;
    }

    // 計算總分的方法
    public int total() {
        return this.chi + this.eng + this.mat;
    }

    // 計算平均的方法
    public double average() {
        return (int) (Math.floor((this.chi + this.eng + this.mat) / 3.0 * 100)) / 100.0;
    }

    // 計算加權平均的方法
    public double average(double wtChi, double wtEng, double wtMat) {
        return ((Math.floor((this.chi * wtChi + this.eng * wtEng + this.mat * wtMat) / (wtChi + wtEng + wtMat) * 100)) / 100);
    }

    // 計算不及格科目個數的方法
    public int notPass() {
        int cnt = 0;
        if (this.chi < 60) {
            cnt += 1;
        }
        if (this.eng < 60) {
            cnt += 1;
        }
        if (this.mat < 60) {
            cnt += 1;
        }
        return cnt;
    }

}
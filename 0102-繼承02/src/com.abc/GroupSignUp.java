package com.abc;

public class GroupSignUp extends SignUp {
    private int totalPeople;  // 參加人數
    private int totalCamera;  // 租用相機台數	       

    // 建構元(1)
    public GroupSignUp(String tel, String name, int totalPeople, int totalCamera) {
        super(tel, name);
        this.totalPeople = totalPeople;
        this.totalCamera = totalCamera;
    }

    // 建構元(2)
    public GroupSignUp() {
    }

    // setters
    public void setTotalPeople(int totalPeople) {
        this.totalPeople = totalPeople;
    }

    public void setTotalCamera(int totalCamera) {
        this.totalCamera = totalCamera;
    }

    // getters
    public int getTotalPeople() {
        return this.totalPeople;
    }

    public int getTotalCamera() {
        return this.totalCamera;
    }

    // 計算總費用
    public int fee() {
        return 500 * totalPeople + 300 * totalCamera;
    }
}
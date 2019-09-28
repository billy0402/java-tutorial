// ----------------------------
// 個人報名 (子類別)
// ----------------------------

package com.abc;

public class GroupSignUp extends SignUp {
    private int numberOfPeople;      // 參加人數
    private int numberOfRentCamera;  // 租用相機台數	       

    // 建構元(1)
    public GroupSignUp(String tel, String name, int numberOfPeople, int numberOfRentCamera) {
        super(tel, name); // 呼叫父親的建構元
        this.numberOfPeople = numberOfPeople;
        this.numberOfRentCamera = numberOfRentCamera;
    }

    // 建構元(2)
    public GroupSignUp() {
    }

    // setter
    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setNumberOfRentCamera(int numberOfRentCamera) {
        this.numberOfRentCamera = numberOfRentCamera;
    }

    // getter
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public int getNumberOfRentCamera() {
        return numberOfRentCamera;
    }

    // 計算總費用
    public int peopleFee() {
        return 500 * numberOfPeople;
    }

    // 計算總費用
    public int cameraFee() {
        return 300 * numberOfRentCamera;
    }

    // 計算總費用
    public int fee() {
        return 500 * numberOfPeople + 300 * numberOfRentCamera;
    }
}
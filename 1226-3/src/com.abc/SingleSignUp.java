// ----------------------------
// 個人報名 (子類別)
// ----------------------------

package com.abc;

public class SingleSignUp extends SignUp {
    private boolean isRentCamera;   // 是否租用相機         

    // 建構元(1)
    public SingleSignUp(String tel, String name, boolean isRentCamera) {
        super(tel, name); // 呼叫父親的建構元
        this.isRentCamera = isRentCamera;
    }

    // 建構元(2)
    public SingleSignUp() {
    }

    // setter
    public void setIsRentCamera(boolean isRentCamera) {
        this.isRentCamera = isRentCamera;
    }

    // getter
    public boolean getIsRentCamera() {
        return isRentCamera;
    }


    // 計算總費用
    public int fee() {
        if (isRentCamera) {
            return 800;
        } else {
            return 500;
        }
    }
}
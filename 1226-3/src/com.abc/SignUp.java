// ----------------------------
// 報名 (父類別)
// ----------------------------

package com.abc;

public class SignUp {
    private String tel;      // 電話
    private String name;     // 報名姓名

    // 建構元(1)
    public SignUp(String tel, String name) {
        this.tel = tel;
        this.name = name;
    }

    // 建構元(2)
    public SignUp() {
    }

    // setter
    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter
    public String getTel() {
        return tel;
    }

    public String getName() {
        return name;
    }
}
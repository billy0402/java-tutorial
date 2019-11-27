package com.abc;

import com.abc.UserInput;

import java.util.ArrayList;


public class Prog3 {
    public void checkLightColor() {
        ArrayList<String> lightKinds = new ArrayList<String>();
        lightKinds.add("紅");
        lightKinds.add("黃");
        lightKinds.add("綠");

        while (true) {
            UserInput userInput = new UserInput();
            String inputStr = userInput.getString("請輸入 紅 或 黃 或 綠 以顯示訊息 或 quit 或 q 以結束程式: ");

            if (inputStr.equals("q") || inputStr.equals("quit")) {
                break;
            } else if (!lightKinds.contains(inputStr)) {
                System.out.println("請重新輸入");
            } else {
                ArrayList<String> checkLights = new ArrayList<String>(lightKinds);
                checkLights.remove(inputStr);
                System.out.printf("%s燈亮，%s%s燈沒亮\n", inputStr, checkLights.get(0), checkLights.get(1));
            }
        }
    }
}
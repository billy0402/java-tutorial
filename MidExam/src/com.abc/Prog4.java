package com.abc;

import com.abc.UserInput;

public class Prog4 {
    public void sum() {
        UserInput userInput = new UserInput();
        int inputInt = userInput.getInt("請輸入一正整數: ");
        if (inputInt < 0) {
            System.out.println("請輸入大於 0 的數字");
        } else {
            int sum = inputInt;
            for (int i = 1; i < inputInt; i++) {
                System.out.printf("%d+", i);
                sum += i;
            }
            System.out.printf("%d=%d\n", inputInt, sum);
        }
    }
}
package com.abc;

import com.abc.UserInput;

public class Prog2 {
    public void drawStar() {
        UserInput userInput = new UserInput();
        int inputInt = userInput.getInt("請輸入一正整數: ");
        int start = inputInt * -1 + 1;
        for (int i = start; i < inputInt; i++) {
            int startSpace = i <= 0 ? inputInt + i : inputInt;
            for (int j = 0; j < startSpace; j++) {
                System.out.print(" ");
            }

            int starNum = Math.abs(i) + 1;
            for (int k = 0; k < starNum; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
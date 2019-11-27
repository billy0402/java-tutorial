package com.abc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    public String getString(String hint) {
        while (true) {
            try {
                System.out.print(hint);
                InputStreamReader input = new InputStreamReader(System.in);
                BufferedReader reader = new BufferedReader(input);
                String inputStr = reader.readLine();

                return inputStr;
            } catch (IOException e) {
                System.out.println("系統錯誤");
            }
        }
    }

    public int getInt(String hint) {
        while (true) {
            try {
                String inputStr = getString(hint);
                int inputNum = Integer.parseInt(inputStr);

                return inputNum;
            } catch (NumberFormatException e) {
                System.out.println("輸入為非數字!");
            }
        }
    }
}
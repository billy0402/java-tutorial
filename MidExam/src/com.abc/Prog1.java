package com.abc;

import com.abc.UserInput;

import java.util.ArrayList;

public class Prog1 {
    private int getPrimeSum(int startNum, int endNum) {
        if (startNum > endNum) {
            int temp = startNum;
            startNum = endNum;
            endNum = temp;
        }

        int sum = 0;
        for (int i = startNum + 1; i < endNum; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    continue;
                }
            }

            if (isPrime) {
                sum += i;
            }
        }

        return sum;
    }

    public void findPrime() {
        UserInput userInput = new UserInput();
        int startNum = userInput.getInt("請輸入m=");
        int endNum = userInput.getInt("請輸入n=");

        if (startNum < 0 || endNum < 0) {
            System.out.println("輸入數字須大於0");
        } else {
            int primeSum = getPrimeSum(startNum, endNum);
            System.out.printf("結果為: %d\n", primeSum);
        }
    }
}
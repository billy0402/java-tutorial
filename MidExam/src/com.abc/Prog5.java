package com.abc;

import com.abc.UserInput;

import java.util.ArrayList;
import java.util.ListIterator;

public class Prog5 {
    public void checkNum() {
        UserInput userInput = new UserInput();
        int arrayCount = userInput.getInt("請輸入一共要輸入幾個數字: ");
        ArrayList<Integer> numArray = new ArrayList<Integer>();
        int maxOdd = 0;
        int sum = 0;
        ArrayList<Integer> evenArray = new ArrayList<Integer>();

        for (int i = 1; i <= arrayCount; i++) {
            int num = userInput.getInt(String.format("請輸入第%d個數字: ", i));
            numArray.add(num);
        }

        ListIterator<Integer> numIterator = numArray.listIterator();
        while (numIterator.hasNext()) {
            int num = numIterator.next();
            if (num % 2 != 0) {
                if (num > maxOdd) {
                    maxOdd = num;
                }
            } else {
                int index = numIterator.nextIndex() - 1;
                evenArray.add(index);
            }

            sum += num;
        }

        System.out.printf("索引值為奇數的數字中最大值為: %d\n", maxOdd);
        System.out.printf("總和為: %d\n", sum);
        System.out.printf("值為偶數的索引值有: %s\n", evenArray.toString());
    }
}
package edu.Lunghwa;

import java.util.Arrays;

public class MyArray {
    int a[];

    public MyArray(int a[]) {
        this.a = a;
    }

    // 傳回 a[]的總和
    public int sum() {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    // 傳回 a[] 的最大者
    public int max() {
        Arrays.sort(a);
        int max = a[a.length - 1];

        return max;
    }

    // 傳回 a[] 所有資料所形成的字串
    public String toString() {
        String str = "";

        for (int i = 0; i < a.length; i++) {
            str += a[i];
        }

        return str;
    }
}
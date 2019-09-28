package com.abc;

import java.util.*;

// 自行定義的類別
public class Statistics {
    // (1)
    // 數值Array 的加總
    // 傳入: 1個數字陣列
    // 傳回: 陣列中的數字總和
    // ----------------------------------------------
    public static double total(double[] data) {
        double tot = 0;

        for (int i = 0; i < data.length; i++) {
            tot += data[i];
        }

        return tot;
    }

    // ----------------------------------------------
    // ----------------------------------------------
    public static double average(double[] data) {
        return Statistics.total(data) / data.length;
    }

    // ----------------------------------------------
    // ----------------------------------------------
    public static double median(double[] data) {
        Arrays.sort(data);

        if (data.length % 2 == 1) {
            return data[(data.length - 1) / 2];
        } else {
            return (data[data.length / 2 - 1] + data[data.length / 2]) / 2;
        }
    }
    // ----------------------------------------------
}
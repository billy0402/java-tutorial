package com.abc;

public class Electricity {
    public static int fee(int degree) {
        if (degree <= 120) {
            return (int) (2.10 * degree);
        } else if (degree >= 121 && degree <= 330) {
            return (int) (2.10 * 120 + 3.02 * (degree - 120));
        } else if (degree >= 331 && degree <= 500) {
            return (int) (2.10 * 120 + 3.02 * 210 + 4.39 * (degree - 330));
        } else if (degree >= 501 && degree <= 700) {
            return (int) (2.10 * 120 + 3.02 * 210 + 4.39 * 170 + 5.44 * (degree - 500));
        } else if (degree >= 701 && degree <= 1000) {
            return (int) (2.10 * 120 + 3.02 * 210 + 4.39 * 170 + 5.44 * 200 + 6.16 * (degree - 700));
        } else if (degree >= 1001) {
            return (int) (2.10 * 120 + 3.02 * 210 + 4.39 * 170 + 5.44 * 200 + 6.16 * 300 + 6.71 * (degree - 1000));
        } else {
            return 0;
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc;

public class Bonus {
    public static int yearEndBonus(String rank, int year) {
        int salary = 0;

        switch (rank) {
            case "A":
                salary = 55000;
                break;
            case "B":
                salary = 48000;
                break;
            case "C":
                salary = 36000;
                break;
            default:
                break;
        }

        if (year < 3) {
            return salary / 12;
        } else if (year >= 3 && year <= 5) {
            return (int) (salary / 12 * 1.5);
        } else if (year >= 6 && year <= 8) {
            return salary / 12 * 2;
        } else if (year >= 9 && year <= 11) {
            return (int) (salary / 12 * 2.5);
        } else if (year >= 12 && year <= 15) {
            return salary / 12 * 3;
        } else if (year >= 16) {
            return salary / 12 * 4;
        } else {
            return 0;
        }
    }
}
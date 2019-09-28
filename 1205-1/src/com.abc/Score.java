/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

public class Score {
    // --------------------------------------------------------------------------------------
    // 計算總分的靜態方法
    // --------------------------------------------------------------------------------------
    public static double total(int chi, int eng, int mat, int soc, int nat, int lec) {
        return chi * 2.5 + eng * 2 + mat * 1.5 + soc * 0.5 + nat * 0.5 + lec * 3;
    }
    // --------------------------------------------------------------------------------------

    // --------------------------------------------------------------------------------------
    // 計算滿分的靜態方法
    // --------------------------------------------------------------------------------------
    public static int perfect(int chi, int eng, int mat, int soc, int nat, int lec) {
        int cnt = 0;

        if (chi == 60) {
            cnt += 1;
        }
        if (eng == 60) {
            cnt += 1;
        }
        if (mat == 60) {
            cnt += 1;
        }
        if (soc == 60) {
            cnt += 1;
        }
        if (nat == 60) {
            cnt += 1;
        }
        if (lec == 12) {
            cnt += 1;
        }
        return cnt;
    }
    // --------------------------------------------------------------------------------------

    // --------------------------------------------------------------------------------------
    // 計算作弊的靜態方法
    // --------------------------------------------------------------------------------------
    public static String remark(int chi, int lec) {
        String cheat = "";

        if (lec == 60 && chi < 50) {
            cheat = "***";
        } else {
            cheat = "△";
        }
        return cheat;
    }
    // --------------------------------------------------------------------------------------
}
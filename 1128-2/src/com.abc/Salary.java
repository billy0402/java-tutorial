/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author USER
 */

package com.abc;

public class Salary {
    public static int salary(String empNo, String name, String rank, int overtime) {
        int tot = 0;

        switch (rank) {
            case "A":
                tot = 25000 + overtime * 200;
                break;
            case "B":
                tot = 30000 + overtime * 250;
                break;
            case "C":
                tot = 35000 + overtime * 300;
                break;
            case "D":
                tot = 40000 + overtime * 350;
                break;
        }
        return tot;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc;

public class Location {
    // ---------------------------------------------------------------------------------------------------------------------
    // 傳入: (1)起點緯度 (2)起點經度 (3)終點緯度 (4)終點經度
    // 傳回: 兩點間的距離(公里)
    // ---------------------------------------------------------------------------------------------------------------------
    public static double distanceBetweenTwoLocations(Double sourceLat, Double sourceLon, Double destLat, Double destLon) {
        double R = 6371; // 地球半徑(公里)

        double dLat = (destLat - sourceLat) * Math.PI / 180;
        double dLon = (destLon - sourceLon) * Math.PI / 180;

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(sourceLat * Math.PI / 180) * Math.cos(destLat * Math.PI / 180) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = (int) (R * c * 1000) / 1000.0; // 兩點間距離(公里)

        return d;
    }
    // ---------------------------------------------------------------------------------------------------------------------
}
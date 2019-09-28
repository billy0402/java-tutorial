package com.abc;

// ---------------------
// 促銷類別
// ---------------------
public class Promotion {
    public static final double discount = 0.15;

    // 促銷價格, 傳入價格減去discount折讓比例後的價格.(無條件捨去)
    // ----------------------------------------------------------    
    public static int promotionPrice(int price) {
        return (int) (price * (1.0 - Promotion.discount));
    }
    // ----------------------------------------------------------
}
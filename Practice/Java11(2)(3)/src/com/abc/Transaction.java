package com.abc;

// ---------------------
// 交易類別
// ---------------------
public class Transaction {
    // 傳入訂貨金額, 傳回運費(無條件進位)
    // 超過50,000免運費; 
    // 20,000~50,000, 收3%運費;
    // 不足20,000, 收4.5%運費.
    public static int shipping(int total) {
        int fare = 0;
        if (total > 50000) {
            return fare;
        } else if (total >= 20000 && total <= 50000) {
            fare = (int) (Math.ceil(total * 3 / 100));
            return fare;
        } else {
            fare = (int) (Math.ceil(total * 4.5 / 100));
            return fare;
        }
    }

    // 傳入訂貨金額, 傳回稅金(四捨五入)
    // 所有交易收6.5%稅金.
    // ----------------------------------------------------------    
    public static int tax(int total) {
        return (int) (Math.round(total * 6.5 / 100));
    }
    // ----------------------------------------------------------
}
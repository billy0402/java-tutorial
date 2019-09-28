package edu.Lunghwa;

public class Int {
    int n;

    public Int(int num) {
        this.n = num;
    }

    public Int() {
        this.n = 0;
    }

    // 傳回 n 的個位數值
    public int digits() {
        // String intStr = Integer.toString(n);// 數字轉字串
        // String lastStr = intStr.substring(intStr.length() - 1);// 最後一位
        // int result = Integer.valueOf(lastStr);// 字串轉數字

        int result = n % 10;

        return result;
    }

    // 傳回 n 的每一位數的和
    public int digitsum() {
        // int sum = 0;
        // String intStr = Integer.toString(n);// 數字轉字串

        // for(int i=0; i<=intStr.length()-1 ; i++){
        //  int digit = Character.getNumericValue(intStr.charAt(i));// 每一位數
        // 	sum += digit;
        // }

        int sum = 0;
        while (n != 0) {
            sum += n % 10; // 從個位數開始
            n /= 10; // 往前推一位
        }

        return sum;
    }

    // 傳回 n 的因數和
    public int factorSum() {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            // 如果整除就是因數
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public int getInt() {
        return this.n;
    }
}
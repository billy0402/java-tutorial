package edu.Lunghwa;

import java.util.Arrays;

public class MyMath {
    // 判斷 n 是否為質數
    public boolean isPrime(int n) {
        boolean result = true;

        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            // 如果整除就是因數
            if (n % i == 0) {
                result = false;
                // break;
            } else {
                result = true;
            }
        }

        return result;
    }

    // 傳回 m, n 中較大者
    public int max(int m, int n) {
        if (m > n) { // m大
            return m;
        } else { // n大 or 相等
            return n;
        }
    }

    // 傳回 m, n, k 中最大者
    public int max(int m, int n, int k) {
        // int result = max(m, n); // 先比前兩個

        // if (!(result > k)) { // 兩數較大者與第三數比
        //  result = k;
        // }

        int num[] = {m, n, k};
        Arrays.sort(num);
        int result = num[2];

        return result;
    }

    // 傳回 m 的 n 次方
    public int pow(int m, int n) {
        // int result = 1;

        // for(int i=1; i<=n ; i++){
        //  result = result * m;
        // }

        double pow = Math.pow(m, n);
        int result = (int) pow;

        return result;
    }
}
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // -----------------------------------
        try {
            System.out.println("請輸入一個數字");
            int m = input.nextInt();
            System.out.println("請輸入一個數字");
            int n = input.nextInt();
            System.out.print("m^n=" + (int) (Math.pow(m, n)));
            System.out.println();
        } catch (Exception e) {
            System.out.println("輸入錯誤");
        }
        // -----------------------------------
        System.out.println("請輸入一個英文字母");
        String ch = input.next();
        if (ch.matches("[a-z]*") && ch.length() < 2) {
            System.out.println(ch + "是小寫字母");
        } else if (ch.matches("[A-Z]*") && ch.length() < 2) {
            System.out.println(ch + "是大寫字母");
        } else {
            System.out.println(ch);
            System.out.println("輸入錯誤");
        }
        // -----------------------------------
        try {
            System.out.println("請輸入一個數字");
            int m = input.nextInt();
            System.out.println("請輸入一個數字");
            int n = input.nextInt();
            System.out.println("m÷n商數=" + (int) (m / n));
            System.out.println("m÷n餘數=" + (int) (m % n));
        } catch (Exception e) {
            System.out.println("輸入錯誤");
        }
        // -----------------------------------
        try {
            System.out.println("請輸入一個數字");
            int m = input.nextInt();
            System.out.println("請輸入一個數字");
            int n = input.nextInt();
            System.out.println("請輸入一個數字");
            int l = input.nextInt();
            int ary[] = {m, n, l};
            Arrays.sort(ary);
            System.out.println("Max=" + ary[0]);
            System.out.println("Min" + ary[2]);
        } catch (Exception e) {
            System.out.println("輸入錯誤");
        }
        // -----------------------------------
        try {
            System.out.println("請輸入一行文字");
            String str = input.next();
            System.out.println("請輸入一個數字");
            int m = input.nextInt();
            System.out.println("請輸入一個數字");
            int n = input.nextInt();
            String a = str.substring(m - 1, n);
            System.out.print(a);
            System.out.println();
        } catch (Exception e) {
            System.out.println("輸入錯誤");
        }
        // -----------------------------------
        // 九九乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print("" + i + "*" + j + "=" + (i * j) + "\t");
                System.out.print(" ");
                if (j == 9) {
                    System.out.println();
                }
            }
        }
    }
}
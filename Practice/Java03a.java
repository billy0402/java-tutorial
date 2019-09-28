import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 小s的內容是一篇文章
        String s = "From the red fox to the fennec fox, foxes look adorable. Because of this, people are sometimes tempted to keep them as pets. However, those who have tried have struggled. Unlike dogs and cats, the different species of fox have not been domesticated. Domestication only happens over a long period of time through selective breeding. Cats and dogs were domesticated by humans thousands of years ago to be pets and companions. Sheep, goats and other animals were domesticated for food. But there may be more to it than that. People who have tried to simply tame individual foxes often speak of a stubborn wildness that is impossible to get rid of. This suggests that foxes harder to tame than other animals. However, one extraordinary experiment has found a way to domesticate foxes. This one study could help us understand how our ancestors domesticated other animals, and indeed what domestication is.";

        System.out.println("原文:" + s);
        System.out.println();

        // -------------------------------------------------
        // (1-a)文章共有多少字母,標點符號及空白(全部總和)?
        System.out.println("全部總和:" + s.length()); // "全部總和:900"
        System.out.println();
        // (1-b)內容都轉成大寫
        System.out.println("小寫:" + s.toLowerCase());
        System.out.println();
        // (1-c)內容都轉成小寫
        System.out.println("大寫:" + s.toUpperCase());
        System.out.println();
        // -------------------------------------------------

        // -------------------------------------------------
        // (2-a)文章中共有多少個空白?
        int blankCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char tem = s.charAt(i);
            if (tem == ' ') {
                blankCount++;
            }
        }
        System.out.println("空白總和:" + blankCount); // "空白總和:149"
        System.out.println();
        // (2-b)文章中共有多少個標點符號?
        int commaCount = 0;
        int periodCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char tem = s.charAt(i);
            if (tem == ',') {
                commaCount++;
            } else if (tem == '.') {
                periodCount++;
            }
        }
        System.out.print("標點符號總和:"); // "標點符號總和:19"
        System.out.println(commaCount + periodCount);
        System.out.println();
        // -------------------------------------------------

        // -------------------------------------------------
        // (3)將文章反向輸出
        String reversedStr = new StringBuffer(s).reverse().toString();
        System.out.println("反向:" + reversedStr);
        System.out.println();
        // -------------------------------------------------

        // -------------------------------------------------
        // (4)文章中,總共有多少個英文字?
        String replaceStr = s.replace(",", "");
        String replaceStr2 = replaceStr.replace(".", "");
        String[] array = replaceStr2.split(" ");
        System.out.println("英文字總和:" + array.length); // "英文字總和:150"
        System.out.println();
        // -------------------------------------------------

        // -------------------------------------------------
        // (5)文章中,總共有多少個英文字?(不重複計算)
        HashSet<String> set = new HashSet<String>();
        for (String a : array) {
            // 不重複計算
            set.add(a);
        }
        System.out.println("不重複英文字總和:" + set.size()); // "不重複英文字總和:101"
        // -------------------------------------------------
    }
}
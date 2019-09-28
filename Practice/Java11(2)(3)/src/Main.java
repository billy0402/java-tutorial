import com.abc.Order;
import com.abc.Transaction;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 建立一個可存放多個物件的串列清單
        ArrayList arrayList = new ArrayList();

        // 以下是一個經銷商的一次訂貨內容, 包括數個訂貨項目.        
        // 將多個「訂貨項目」物件加入串列清單中
        arrayList.add(new Order("擦手紙", 2400));
        arrayList.add(new Order("洗手乳", 9500));
        arrayList.add(new Order("衛生紙", 18500));
        arrayList.add(new Order("面紙", 5600));
        arrayList.add(new Order("餐巾紙/廚房紙巾", 4700));

        int total = 0;

        // 逐一列印訂貨單目資料			
        for (int i = 0; i < arrayList.size(); i++) {
            // 取出串列清單中的第i個物件		
            Order c = (Order) arrayList.get(i);

            // 呼叫物件的方法, 印出物件資訊			
            System.out.println("名稱:" + c.getName());
            System.out.println("小計:" + c.getSubtotal());
            System.out.println("--------------------");

            total += c.getSubtotal();
        }

        System.out.println("訂貨總額:" + total);
        System.out.println("加收運費:" + Transaction.shipping(total));
        System.out.println("加收稅金:" + Transaction.tax(total));
        System.out.println("總計金額:" + (total + Transaction.shipping(total) + Transaction.tax(total)));
        System.out.println("--------------------");
    }
}
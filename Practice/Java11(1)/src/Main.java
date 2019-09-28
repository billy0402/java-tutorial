// ---------------------
// 主程式類別
// ---------------------

import com.abc.Product;
import com.abc.Promotion;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 建立一個可存放多個物件的串列清單
        ArrayList arrayList = new ArrayList();

        // 將多個「產品」物件加入串列清單中
        arrayList.add(new Product("擦手紙", 85, 69));
        arrayList.add(new Product("洗手乳", 180, 159));
        arrayList.add(new Product("衛生紙", 210, 199));
        arrayList.add(new Product("面紙", 140, 129));
        arrayList.add(new Product("餐巾紙/廚房紙巾", 165, 149));

        // 逐一列印產品資料			
        for (int i = 0; i < arrayList.size(); i++) {
            // 取出串列清單中的第i個物件		
            Product c = (Product) arrayList.get(i);

            // 呼叫物件的方法, 印出物件資訊			
            System.out.println("名稱:" + c.getName());
            System.out.println("定價:" + c.getPrice());
            System.out.println("特價:" + c.getSpecialPrice());
            System.out.println("促銷:" + Promotion.promotionPrice(c.getSpecialPrice()));
            System.out.println("--------------------");
        }
    }
}
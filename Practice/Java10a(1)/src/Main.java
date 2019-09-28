import com.abc.Customer;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 建立一個可存放多個物件的串列清單
        ArrayList arrayList = new ArrayList();

        // 將多個「客戶」物件加入串列清單中
        arrayList.add(new Customer("張小鈞", "0911-111-111", "宜蘭市經國路38號"));
        arrayList.add(new Customer("沈小廷", "0911-222-222", "桃園縣富國路42號"));
        arrayList.add(new Customer("劉小宏", "0911-333-333", "台中市仁愛路二段120號"));
        arrayList.add(new Customer("林小豪", "0911-444-444", "新竹市永平路一段1號"));
        arrayList.add(new Customer("劉小安", "0911-555-555", "台中市中港路一段78號"));

        // 逐一列印客戶資料			
        for (int i = 0; i < arrayList.size(); i++) {
            // 取出串列清單中的第i個物件		
            Customer c = (Customer) arrayList.get(i);

            // 呼叫物件的方法, 印出物件資訊			
            System.out.println(c.getCusName());
            System.out.println(c.getTel());
            System.out.println(c.getAddress());
            System.out.println("--------------------");
        }
    }
}
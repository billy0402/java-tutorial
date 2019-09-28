import com.abc.Transaction;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 建立一個可存放多個物件的串列清單
        ArrayList arrayList = new ArrayList();

        // 將多個「交易」物件加入串列清單中
        arrayList.add(new Transaction("2017-10-1", "張小鈞", "智慧手環", 25));
        arrayList.add(new Transaction("2017-10-1", "沈小廷", "USB隨身碟", 40));
        arrayList.add(new Transaction("2017-10-2", "張小鈞", "音樂撥放器", 30));
        arrayList.add(new Transaction("2017-10-3", "林小豪", "光學滑鼠", 10));
        arrayList.add(new Transaction("2017-10-3", "張小鈞", "充電器", 50));

        // 逐一列印交易資料			
        for (int i = 0; i < arrayList.size(); i++) {
            // 取出串列清單中的第i個物件		
            Transaction c = (Transaction) arrayList.get(i);

            // 呼叫物件的方法, 印出物件資訊			
            System.out.println(c.getDate());
            System.out.println(c.getCusName());
            System.out.println(c.getItem());
            System.out.println(c.getAmount());
            System.out.println("--------------------");
        }
    }
}
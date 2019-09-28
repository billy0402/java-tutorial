import com.abc.PartTimeEmployee;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 建立一個可存放多個物件的串列清單
        ArrayList arrayList = new ArrayList();

        // 將多個「時薪員工」物件加入串列清單中
        arrayList.add(new PartTimeEmployee("HR001", "高小澤", 25));
        arrayList.add(new PartTimeEmployee("HR002", "杜小瑜", 30));
        arrayList.add(new PartTimeEmployee("AC001", "賴小蓁", 23));
        arrayList.add(new PartTimeEmployee("AC002", "廖小晴", 18));
        arrayList.add(new PartTimeEmployee("TR001", "吳小璇", 36));

        // 逐一列印時薪員工資料			
        for (int i = 0; i < arrayList.size(); i++) {
            // 取出串列清單中的第i個物件		
            PartTimeEmployee c = (PartTimeEmployee) arrayList.get(i);

            // 呼叫物件的方法, 印出物件資訊			
            System.out.println(c.getEmpNo());
            System.out.println(c.getEmpName());
            System.out.println(c.getWorkHours());
            System.out.println(c.totalSalary());
            System.out.println("--------------------");
        }
    }
}
import com.abc.*;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 建立一個可存放多個物件的串列清單
        ArrayList arrayList = new ArrayList();

        // 將多個「員工」物件加入串列清單中
        arrayList.add(new Employee("1001", "張小鈞", 'A', 18, 5));
        arrayList.add(new Employee("1002", "沈小廷", 'A', 16, 8));
        arrayList.add(new Employee("1003", "劉小宏", 'B', 14, 6));
        arrayList.add(new Employee("1004", "林小豪", 'B', 12, 0));
        arrayList.add(new Employee("1005", "劉小安", 'C', 3, 10));

        // 逐一列印員工資料
        for (int i = 0; i < arrayList.size(); i++) {
            // 取出串列清單中的第i個物件
            Employee c = (Employee) arrayList.get(i);

            // 呼叫物件的方法, 印出物件資訊
            System.out.println("編號:" + c.getEmpNo());
            System.out.println("姓名:" + c.getName());
            System.out.println("職等:" + c.getRank());
            System.out.println("年資:" + c.getSeniority());
            System.out.println("薪水:" + c.salary());
            System.out.println("年終:" + c.month());
            System.out.println("--------------------");
        }
    }
}
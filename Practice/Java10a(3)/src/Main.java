import com.abc.Employee;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 建立一個可存放多個物件的串列清單
        ArrayList arrayList = new ArrayList();

        // 將多個「員工」物件加入串列清單中
        arrayList.add(new Employee("E001", "楊小儱", 34000, 5));
        arrayList.add(new Employee("E002", "陳小永", 35000, 6));
        arrayList.add(new Employee("E003", "宋小運", 41000, 0));
        arrayList.add(new Employee("E004", "方小勳", 36000, 7));
        arrayList.add(new Employee("E005", "劉小言", 39000, 10));

        // 逐一列印員工資料			
        for (int i = 0; i < arrayList.size(); i++) {
            // 取出串列清單中的第i個物件		
            Employee c = (Employee) arrayList.get(i);

            // 呼叫物件的方法, 印出物件資訊			
            System.out.println(c.getEmpNo());
            System.out.println(c.getEmpName());
            System.out.println(c.getBaseSalary());
            System.out.println(c.getOverHours());
            System.out.println(c.totalSalary());
            System.out.println("--------------------");
        }
    }
} 

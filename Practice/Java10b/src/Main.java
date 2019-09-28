import com.abc.*;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 建立一個可存放多個物件的串列清單
        ArrayList arrayList = new ArrayList();

        // 將多個「電費」物件加入串列清單中
        arrayList.add(new ElectricityBill("黃小珊", true, true, 200));
        arrayList.add(new ElectricityBill("葉小彤", true, false, 200));
        arrayList.add(new ElectricityBill("何小葶", true, true, 450));
        arrayList.add(new ElectricityBill("劉小君", true, false, 450));
        arrayList.add(new ElectricityBill("郭小于", true, true, 550));
        arrayList.add(new ElectricityBill("張小婷", false, false, 550));
        arrayList.add(new ElectricityBill("鄭小慈", false, true, 750));
        arrayList.add(new ElectricityBill("陳小穎", false, false, 750));
        arrayList.add(new ElectricityBill("林小佑", false, true, 1200));
        arrayList.add(new ElectricityBill("柯小濰", false, false, 1200));

        // 逐一列印電費資料			
        for (int i = 0; i < arrayList.size(); i++) {
            // 取出串列清單中的第i個物件		
            ElectricityBill c = (ElectricityBill) arrayList.get(i);

            // 呼叫物件的方法, 印出物件資訊			
            System.out.println(c.getCusName());
            System.out.println(c.getIsBusiness());
            System.out.println(c.getIsSummer());
            System.out.println(c.fee());
            System.out.println("--------------------");
        }
    }
}
import com.abc.Transcript;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 建立一個可存放多個物件的串列清單
        ArrayList arrayList = new ArrayList();

        // 將多個「成績單」物件加入串列清單中

        arrayList.add(new Transcript("1011", "鄒小明", 65, 43, 92));
        arrayList.add(new Transcript("1012", "林小倫", 35, 65, 77));
        arrayList.add(new Transcript("1013", "賴小茹", 85, 65, 60));
        arrayList.add(new Transcript("1014", "李小澄", 60, 70, 45));
        arrayList.add(new Transcript("1015", "張小龍", 55, 45, 45));

        double totChi = 0;
        double totEng = 0;
        double totMat = 0;

        // 逐一列印成績單資料			
        for (int i = 0; i < arrayList.size(); i++) {
            // 取出串列清單中的第i個物件		
            Transcript c = (Transcript) arrayList.get(i);

            // 呼叫物件的方法, 印出物件資訊			
            System.out.println("學號:" + c.getStuNo());
            System.out.println("姓名:" + c.getName());
            System.out.println("國文:" + c.getChi());
            System.out.println("英文:" + c.getEng());
            System.out.println("數學:" + c.getMat());
            System.out.println("總分:" + c.total());
            System.out.println("平均:" + c.average());
            System.out.println("加權:" + c.average(2.5, 2, 1));
            System.out.println("未過:" + c.notPass());
            System.out.println("--------------------");

            totChi += c.getChi();
            totEng += c.getEng();
            totMat += c.getMat();
        }

        // 印出全班平均分數(某科目全班總分/全班人數)
        System.out.println("全班國文平均:" + totChi / arrayList.size());
        System.out.println("全班英文平均:" + totEng / arrayList.size());
        System.out.println("全班數學平均:" + totMat / arrayList.size());
        System.out.println("--------------------");
    }
}
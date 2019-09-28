import com.abc.MyThread;

public class Main {
    public static void main(String[] argv) {
        // 生成執行緒物件
        MyThread t1 = new MyThread("小白", "https://www.mobile01.com/index.php", "1.txt");
        MyThread t2 = new MyThread("小黑", "https://tw.yahoo.com/", "2.txt");
        MyThread t3 = new MyThread("小綠", "http://www.ntub.edu.tw/index.php", "3.txt");

        // 啟動執行緒
        t1.start();
        t2.start();
        t3.start();
    }
}
import com.abc.*;

public class Main {
    public static void main(String[] argv) {
        // 產生一個計數器物件   
        Counter counter = new Counter();

        // 兩個執行緒取用同一個counter物件	   
        MyThread t1 = new MyThread("小白", counter);
        MyThread t2 = new MyThread("小黑", counter);

        t1.start();
        t2.start();
    }
}

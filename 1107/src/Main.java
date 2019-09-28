import com.abc.*;

public class Main {
    public static void main(String[] args) {
        double[] data1 = {10, 18.5, 10.3, 16, 21, 17.4, 22, 12, 15, 12, 13.4, 16.8, 11.9};
        double[] data2 = {10, 18.5, 10.3, 16, 21, 17.4, 22, 12, 15, 12, 13.4, 16.8, 11.9, 18};

        System.out.println("總和:" + Statistics.total(data1));
        System.out.println("總和:" + Statistics.total(data2));

        System.out.println("平均:" + Statistics.average(data1));
        System.out.println("平均:" + Statistics.average(data2));

        System.out.println("中位數:" + Statistics.median(data1));
        System.out.println("中位數:" + Statistics.median(data2));
    }
}
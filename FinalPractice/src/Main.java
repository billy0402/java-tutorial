// https://hackmd.io/@EnWei/HkeqQtp18
import com.abc.Drink;
import com.abc.DrinkShop;
import com.abc.Customer;

class Main {
    public static void main(String[] args) {
        // 生成一個 DrinkShop 類別的物件, 並且由建構元設定初值
        DrinkShop shop = new DrinkShop("7-11=-4", "台北市中正區濟南路", new Drink[] {
            new Drink("麥香奶茶鋁箔包", 10),
            new Drink("純喫茶檸檬紅茶", 25),
            new Drink("麥香奶茶(日月潭)寶特瓶", 28),
            new Drink("麥香奶茶(舞鶴)寶特瓶", 28),
            new Drink("麥香紅茶鋁箔包", 10),
        });
        // 印出類別的成員
        shop.printMenu();

        Customer customer = new Customer("小明", 200);
        System.out.println("customer.getName() => " + customer.getName());
        System.out.println("customer.getMoney() => " + customer.getMoney());

        Drink firstDrink = shop.buy(customer);
        System.out.println("firstDrink.getName() => " + firstDrink.getName());
        System.out.println("firstDrink.getPrice() => " + firstDrink.getPrice());
        System.out.println("customer.getMoney() => " + customer.getMoney());

        Drink leamonTea = shop.buy(customer, "純喫茶檸檬紅茶");
        System.out.println("leamonTea.getName() => " + leamonTea.getName());
        System.out.println("leamonTea.getPrice() => " + leamonTea.getPrice());
        System.out.println("customer.getMoney() => " + customer.getMoney());

        Drink milkTeaBottle = shop.buy(customer, 28);
        System.out.println("milkTeaBottle.getName() => " + milkTeaBottle.getName());
        System.out.println("milkTeaBottle.getPrice() => " + milkTeaBottle.getPrice());
        System.out.println("customer.getMoney() => " + customer.getMoney());

        Drink secondMilkTeaBottle = shop.buyWithDrinkNameLength(customer, 11);
        System.out.println("secondMilkTeaBottle.getName() => " + secondMilkTeaBottle.getName());
        System.out.println("secondMilkTeaBottle.getPrice() => " + secondMilkTeaBottle.getPrice());
        System.out.println("customer.getMoney() => " + customer.getMoney());

        Drink blackTea = shop.buyWithKeyword(customer, "麥香紅茶");
        System.out.println("blackTea.getName() => " + blackTea.getName());
        System.out.println("blackTea.getPrice() => " + blackTea.getPrice());
        System.out.println("customer.getMoney() => " + customer.getMoney());

        System.out.println("shop.getName() => " + shop.getName());
        System.out.println("shop.getName() => " + shop.getAddress());
        System.out.println("shop.isAtCity(\"台北市中正區\") => " + shop.isAtCity("台北市中正區"));
        System.out.println("shop.isAtCity(\"宜蘭縣宜蘭市\") => " + shop.isAtCity("宜蘭縣宜蘭市"));
        System.out.println("shop.isAtStreet(\"濟南路\") => " + shop.isAtStreet("濟南路"));
        System.out.println("shop.isAtStreet(\"林森南路\") => " + shop.isAtStreet("林森南路"));
    }
}
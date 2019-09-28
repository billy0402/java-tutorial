package com.abc;

public class Bill {
    public static int fee(int shoes, int boots, int bags, boolean fastService) {
        if (fastService) {
            return Price.shoesPrice * shoes + Price.bootsPrice * boots + Price.bagPrice * bags + 100 * (shoes + boots + bags);
        } else {
            return Price.shoesPrice * shoes + Price.bootsPrice * boots + Price.bagPrice * bags;
        }
    }
}
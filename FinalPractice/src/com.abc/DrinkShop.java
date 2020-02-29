package com.abc;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.abc.Drink;
import com.abc.Customer;

public class DrinkShop {
    // 成員
    private String name;
    private String address;
    private Drink[] drinks;

    // 建構元
    public DrinkShop(String name, String address, Drink[] drinks) {
        this.name = name;
        this.address = address;
        this.drinks = drinks;
    }

    // 公用方法, 用來取出成員值
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    // 輸出每種飲料的名稱與價格
    public void printMenu() {
        for (Drink drink : drinks) {
            String name = drink.getName();
            int price = drink.getPrice();
            System.out.printf("%s$%d\n", name, price);
        }
    }

    // 購買第一瓶飲料
    public Drink buy(Customer customer) {
        Drink drink = drinks[0];
        customer.spendMoney(drink.getPrice());
        return drink;
    }

    // 購買第一瓶名稱是 drinkName 的飲料
    public Drink buy(Customer customer, String drinkName) {
        Drink drink = Arrays.stream(drinks).filter(
            x -> x.getName().equals(drinkName)
        ).toArray(Drink[]::new)[0];
        customer.spendMoney(drink.getPrice());

        return drink;
    }

    // 購買第一瓶價格是 price 的飲料
    public Drink buy(Customer customer, int price) {
        Drink drink = Arrays.stream(drinks).filter(
            x -> x.getPrice() == price
        ).toArray(Drink[]::new)[0];
        customer.spendMoney(drink.getPrice());

        return drink;
    }

    // 購買飲料名稱長度為 length 的第一瓶飲料
    public Drink buyWithDrinkNameLength(Customer customer, int length) {
        Drink drink = Arrays.stream(drinks).filter(
            x -> x.getName().length() == length
        ).toArray(Drink[]::new)[0];
        customer.spendMoney(drink.getPrice());

        return drink;
    }

    // 購買飲料名稱中包含 keyword 的第一瓶飲料
    public Drink buyWithKeyword(Customer customer, String keyword) {
        Drink drink = Arrays.stream(drinks).filter(
            x -> x.getName().contains(keyword)
        ).toArray(Drink[]::new)[0];
        customer.spendMoney(drink.getPrice());

        return drink;
    }

    // 是否在對應的城市中
    public boolean isAtCity(String cityName) {
        Pattern pattern = Pattern.compile("(.+[縣市].+[市區])");
        Matcher matcher = pattern.matcher(this.address);
        if (matcher.find()) {
            String adressCity = matcher.group(1);
            if (adressCity.equals(cityName)) {
                return true;
            }
        }

        return false;
    }

    // 是否在對應的街道中
    public boolean isAtStreet(String streetName) {
        Pattern pattern = Pattern.compile(".+[市區](.+路)");
        Matcher matcher = pattern.matcher(this.address);
        if (matcher.find()) {
            String adressStreet = matcher.group(1);
            if (adressStreet.equals(streetName)) {
                return true;
            }
        }

        return false;
    }
}
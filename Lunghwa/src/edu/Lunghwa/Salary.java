package edu.Lunghwa;

public class Salary {
    String name;
    int salary, overtime;

    public Salary(String name, int salary, int overtime) {
        this.name = name;
        this.salary = salary;
        this.overtime = overtime;
    }

    // 根據底薪和加班時數計算月薪
    public int monthSalary() {
        double total = salary;

        // if(overtime > 0){
        //  total += overtime*150; // 基本加班費
        // }

        // if(overtime > 20){
        //  overtime -= 20;
        //  total += overtime*150*0.2; // 超過20小時的部分
        // }

        // if(overtime > 20){
        //  overtime -= 20;
        //  total += overtime*150*0.1; // 超過40小時的部分
        // }

        if (overtime > 0 && overtime <= 20) {
            total += overtime * 150;
        } else if (overtime > 20 && overtime <= 40) {
            total += 20 * 150 + (overtime - 20) * 150 * 1.2;
        } else if (overtime > 40) {
            total += 20 * 150 + 20 * 150 * 1.2 + (overtime - 40) * 150 * 1.3;
        }

        return (int) total;
    }

    // 傳回 name, salary, overtime 基本資料
    public String toString() {
        String result = "";
        result += "name:" + name + "\n";
        result += "salary:" + salary + "\n";
        result += "overtime:" + overtime;

        return result;
    }
}

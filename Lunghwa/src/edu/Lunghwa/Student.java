package edu.Lunghwa;

public class Student {
    private String name, id;
    double height, weight;

    public Student(String name, String id, double height, double weight) {
        this.name = name;
        this.id = id;
        this.height = height;
        this.weight = weight;
    }

    // 將 name 的第二字元設為 * 傳回
    public String getName() {
        String lastStr = String.valueOf(name.charAt(1));
        name = name.replaceFirst(lastStr, "*");

        return name;
    }

    // 將 id 的倒數第二、三個字元設為 * 傳回
    public String getId() {
        int startIndex = id.length() - 2;
        int endIndex = id.length();
        String lastTwoStr = id.substring(startIndex, endIndex);
        id = id.replaceFirst(lastTwoStr, "**");

        return id;
    }

    // 根據身高體重，傳回 bmi 值
    public double bmi() {
        double bmi = weight / Math.pow(height / 100.0, 2);

        return bmi;
    }
}
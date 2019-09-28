package edu.Lunghwa;

public class MyString {
    char array[];

    public MyString(String str) {
        this.array = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            this.array[i] = str.charAt(i);
        }
    }

    ;

    public MyString(char array[]) {
        this.array = array;
    }

    ;

    // 傳回 array[] 大寫字母的個數
    public int upper() {
        int upperCount = 0;

        // for(int i = 0;i < array.length;i ++){
        //    int charAscii = (int)array[i];

        //    if (charAscii >= 65 && charAscii <= 90) {
        //      upperCount++;
        //    }
        // }

        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                upperCount++;
            }
        }

        return upperCount;
    }

    // 傳回 array[] 的標點符號個數（非大寫、小寫、數字字元）
    public int punctuation() {
        int punctuationCount = 0;

        // for(int i = 0;i < array.length;i ++){
        //    int charAscii = (int)array[i];

        //    if (charAscii >= 48 && charAscii <= 57) { // 數字
        //    } else if (charAscii >= 65 && charAscii <= 90) { // 大寫
        //    } else if (charAscii >= 97 && charAscii <= 122) { // 小寫
        //    } else {
        //      punctuationCount++;
        //    }
        // }

        for (int i = 0; i < array.length; i++) {
            if (!Character.isLetter(array[i]) && !Character.isDigit(array[i])) {
                punctuationCount++;
            }
        }

        return punctuationCount;
    }
}
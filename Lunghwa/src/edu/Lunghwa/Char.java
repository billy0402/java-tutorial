package edu.Lunghwa;

public class Char {
    char ch;

    public Char(char ch) {
        this.ch = ch;
    }

    // 判斷 ch 是否為大寫字母
    public boolean isUpper() {
        if (Character.isUpperCase(ch)) {
            return true;
        } else {
            return false;
        }
    }

    // 傳回 ch 轉成小寫的物件
    public Char toLower() {
        char lowerLetter = Character.toLowerCase(ch);
        Char result = new Char(lowerLetter);

        return result;
    }

    // 傳回 ch 的內碼
    public Int Ascii() {
        int ascii = (int) ch;
        Int i = new Int(ascii);

        return i;
    }

    public char getChar() {
        return this.ch;
    }
}

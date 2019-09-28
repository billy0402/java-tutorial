# 練習02a 字串的處理
測試以下的字串是否符合條件:

## (1)
字串的長度是至少為2.
<br />
例如:
<br />
a5322121a  (正確)
<br />
a          (不正確)
```java
public class Main {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(s);
        
        if (s.length() >= 2) {
            System.out.println("PASS");
        } else {
            System.out.println("NOT PASS");
        }
    }
}
```

## (2)
字串的長度是至少為2, 而且(第1碼)與(最後1碼)相同.
<br />
例如:
<br />
a5322121a  (正確)
<br />
a12321b    (不正確)
```java
public class Main {
    public static void main(String[] args) {
        String s = "a12321b";
        System.out.println(s);

        if (s.length() >= 2 && s.charAt(0) == s.charAt(s.length() - 1)) {
            System.out.println("PASS");
        } else {
            System.out.println("NOT PASS");
        }
    }
}
```

## (3)
字串的長度是5~10位, 而且每一碼都相同.
<br />
例如:
<br />
aaaaaa  (正確)
<br />
ccccccc (正確)
<br />
111     (不正確)
<br />
123123  (不正確)
```java
public class Main {
    public static void main(String[] args) {
        String s = "aaaaaaaaaa";
        int cnt = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                cnt++;
            }
        }

        System.out.println(s);
        if (cnt == 0 && s.length() >= 5 && s.length() <= 10) {
            System.out.println("PASS");
        } else {
            System.out.println("NOT PASS");
        }
    }
}
```

## (4)
字串長度為奇數, 內容只能有數字.
<br />
例如:
<br />
54345   (正確)
<br />
42*a2   (不正確)
<br />
1234    (不正確)
<br />
1421    (不正確)
```java
public class Main {
    public static void main(String[] args) {
        String s = "1421";
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                cnt++;
            }
        }

        System.out.println(s);
        if (cnt == 0 && s.length() % 2 != 0) {
            System.out.println("PASS");
        } else {
            System.out.println("NOT PASS");
        }
    }
}
```

## (5)
字串長度至少為5, 內容只能有數字及小數點.
<br />
字串內容可以沒有小數點, 但如果內容有小數點, 只能有1個, 而且小數點之後一定要有其他數字.
<br />
例如:
<br />
54221     (正確)
<br />
543.1     (正確)
<br />
5321.     (不正確)
<br />
5.3.1     (不正確)
```java
public class Main {
    public static void main(String[] args) {
        String input = "5.3.1";
        boolean flag = true;
        int dot = 0;

        if (input.length() < 5) {
            flag = false;
        }

        for (int i = 0; i < input.length(); i++) {
            char number = input.charAt(i);

            if (number == '.' && dot == 1) {
                flag = false;
            }

            if (number == '.') {
                dot = 1;
            }

            if ((number < '0' || number > '9') && number != '.') {
                flag = false;
            }
        }

        if (input.charAt(input.length() - 1) == '.') {
            flag = false;
        }

        System.out.println(input);
        if (flag) {
            System.out.println("PASS");
        } else {
            System.out.println("NOT PASS");
        }
    }
}
```
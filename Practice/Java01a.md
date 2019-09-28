# 練習01a 

## (1)

某個遊樂園大人門票655元, 小孩325元.
<br />
若有2個大人及1個小孩同行, 優惠打85折的條件下,
<br />
入場費共多少元? (小數捨去, 只印整數)
```java
public class Main {
    public static void main(String[] args) {
        int adult = 655;
        int child = 325;
        int total = (int) ((adult * 2 + child * 1) * 0.85);
        System.out.println(total); // 1389
    }
}
```

## (2)
有一個圓形的半徑是15公分, 請問面積是多少平方公分?
<br />
請在同一個程式中, 依序:
<br />
(a)小數捨去, 只印整數
<br />
(b)小數也印出
```java
public class Main {
    public static void main(String[] args) {
        int r = 15;

        int intArea = (int) (r * r * Math.PI);
        System.out.println(intArea); // 706

        double doubleArea = r * r * Math.PI;
        System.out.println(doubleArea); // 706.8583470577034
    }
}
```

## (3)
在一個平面座標(x, y)中有2個點, 座標分別是(10, 5)及(22, 17).
<br />
請計算此兩點之間的距離? (印出所有小數位數即可)
```java
public class Main {
    public static void main(String[] args) {
        double x1 = 10, y1 = 5;
        double x2 = 22, y2 = 17;
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.println(distance); // 16.97056274847714
    }
}
```

## (4)
華氏溫度(F)和攝氏溫度(C)轉換公式如下:
<br />
華氏 = 攝氏 * (9/5) + 32
<br />
請計算:
<br />
(a)攝氏32度  = 華氏 ? 度

```java
public class Main {
    public static void main(String[] args) {
        double f = 32;
        double c = f * (9.0 / 5) + 32;
        System.out.println(c); // 89.6
    }
}
```

(b)華氏100度 = 攝氏 ? 度
<br />
(印出整數數位數即可, 小數捨去)
```java
public class Main {
    public static void main(String[] args) {
        double c = 100;
        double f = (c - 32) * 5 / 9;
        System.out.println(f); // 37.77777777777778
    }
}
```

## (5)
一個圓形的[角度]有360度; 如果用[徑度]為單位, 一個圓形有2*PI度.
<br />
請計算: 角度36度  = 徑度 ? 度
<br />
(a)小數至第2位, 其後無條件捨去
```java
public class Main {
    public static void main(String[] args) {
        double deg = 36;
        double rad = 2 * Math.PI * deg / 360;

        System.out.println(Math.floor(rad * 100) / 100.0); // 0.62
    }
}
```

(b)小數至第2位, 其後無條件進位
```java
public class Main {
    public static void main(String[] args) {
        double deg = 36;
        double rad = 2 * Math.PI * deg / 360;

        System.out.println(Math.ceil(rad * 100) / 100.0); // 0.63
    }
}
```

(c)小數至第2位, 其後四捨五入
```java
public class Main {
    public static void main(String[] args) {
        double deg = 36;
        double rad = 2 * Math.PI * deg / 360;

        System.out.println(Math.round(rad * 100) / 100.0); // 0.63
    }
}
```
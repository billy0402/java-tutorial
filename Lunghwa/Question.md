# 物件導向程式設計參考試題
一、	設計一個 Int 類別
1.	資料欄位：	int	n
2.	建構式：
public Int(int n)：根據傳入的參數設定資料欄位 n
public Int()：將資料欄位 n 預設為 0
3.	方法：
int digits()：傳回 n 的個位數值
int digitsum()：傳回 n 的每一位數的和
int factorSum()：傳回 n 的因數和。

二、	設計一個 Char 類別
1.	資料欄位：	char		ch
2.	建構式：
public Char(char ch)：根據傳入的參數設定資料欄位 ch
3.	方法：
boolean isUpper()：判斷 ch 是否為大寫字母
Char toLower()：傳回 ch 轉成小寫的物件
Int Ascii()：傳回 ch 的內碼

三、	設計一個 MyMath 類別
1.	方法：
boolean isPrime(int n)：判斷 n 是否為質數
int max(int m, int n)：傳回 m, n 中較大者
int max(int m, int n, int k)：傳回 m, n, k 中最大者
int pow(int m, int n)：傳回 m 的 n 次方

四、	設計一個 Point 類別
1.	資料欄位：	double x, y
2.	建構式：
public Point(double x, double y)：根據傳入的參數設定資料欄位 x, y
public Point()：將座標點預設為原點
3.	方法：
double leng(Point p)：傳回與座標點 p 的距離
Point midP(Point p)：傳回與座標點 p 的中點
Poing polar(double leng, double angle)：傳回與 (x, y) 的距離為 leng，角度為 angle 的座標點

五、	設計一個 Student 類別
1.	資料欄位：
private String name, id
double height, wieght
2.	建構式：
public Student(name, id, height, wieght)：根據傳入的參數設定資料欄位
3.	方法：
String getName()：將 name 的第二字元設為 * 傳回
String getId()：將 id 的倒數第二、三個字元設為 * 傳回
double bmi()：根據身高體重，傳回 bmi 值

六、	設計一個 Salary 類別
1.	資料欄位：
String name
int	salary, overtime // 底薪、加班時數
2.	建構式：
public Salary(name, salary, overtime)：根據參數設定對應的資料欄位
3.	方法
int monthSalary()：根據底薪和加班時數計算月薪，假設加班的基本時薪是 150，超過 20 小時的部份乘於 1.2，超過 40 小時部份乘於 1.3。
String toString()：傳回 name, salary, overtime 基本資料

七、	設計一個 MyString 類別
1.	資料欄位： 字元陣列 char array[]
2.	建構式：
public MyString(String str)：根據字串參數 str 設定資料欄位 array[]
public MyString(char array[])：根據字元陣列參數設定資料欄位
3.	方法：
int upper()：傳回 array[] 大寫字母的個數
int punctuation()：傳回 array[] 的標點符號個數（非大寫、小寫、數字字元）

八、	設計一個 MyArray 類別
1.	資料欄位： 整數陣列 int	a[]
2.	建構式：
public MyArray (a[])：根據字參數設定資料欄位
3.	方法：
int sum()：傳回 a[]的總和
int max()：傳回 a[] 的最大者
String toString()：傳回 a[] 所有資料所形成的字串
class Main {
    public static void main(String[] args) {
        drawSquare(3);
    }

    public static void drawSquare(int n) {
        // 第一個正方形的前五行
        System.out.println("*".repeat(10));
        for (int line = 2; line <= 5; line++) {
            System.out.print("*");
            System.out.print(" ".repeat(8));
            System.out.print("*");
            System.out.println();
        }

        // 剩下的行數
        for (int square = 1; square <= n; square++) {
            for (int line = 1; line <= 5; line++) {
                System.out.print(" ".repeat(6 * (square - 1)));
                if (square != n) {
                    if (line == 5) {
                        System.out.print("*".repeat(10));
                        System.out.print(" ".repeat(5));
                        System.out.print("*");
                    } else {
                        System.out.print("*");
                        System.out.print(" ".repeat(5));
                        if (line == 1) {
                            System.out.print("*".repeat(10));
                        } else {
                            System.out.print("*");
                            System.out.print(" ".repeat(2));
                            System.out.print("*");
                            System.out.print(" ".repeat(5));
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                } else {
                    if (line == 5) {
                        System.out.print("*".repeat(10));
                    } else {
                        System.out.print("*");
                        System.out.print(" ".repeat(8));
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}
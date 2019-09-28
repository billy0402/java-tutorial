package edu.Lunghwa;

public class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    // 傳回與座標點 p 的距離
    public double leng(Point p) {
        double xDistance = Math.abs(p.x - x);
        double yDistance = Math.abs(p.y - y);
        double xSquare = Math.pow(xDistance, 2);
        double ySquare = Math.pow(yDistance, 2);
        double result = Math.sqrt(xSquare + ySquare);

        return result;
    }

    // 傳回與座標點 p 的中點
    public Point midP(Point p) {
        double xPoint = (p.x - x) / 2;
        double yPoint = (p.y - y) / 2;
        Point middle = new Point(xPoint, yPoint);

        return middle;
    }

    // 傳回與 (x, y) 的距離為 leng，角度為 angle 的座標點
    public Point polar(double leng, double angle) {
        double xPoint = x + leng * Math.cos(angle);
        double yPoint = y + leng * Math.sin(angle);
        Point result = new Point(xPoint, yPoint);

        return result;
    }

    public String getPoint() {
        // String xPoint = Double.toString(x);
        // String yPoint = Double.toString(y);

        return "(" + x + "," + y + ")";
    }
}

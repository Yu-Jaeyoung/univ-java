package chap06.point;

public class Point {
    private int x;
    private int y;

    public Point() {
        System.out.println("Point() constructor executed.");
    }

    public Point(int x, int y) {
        System.out.println("Point(int x, int y) constructor executed.");
        this.x = x;
        this.y = y;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

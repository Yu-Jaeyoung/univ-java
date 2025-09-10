package chap05.point;

public class Point {
    private int x;
    private int y;

    void set(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

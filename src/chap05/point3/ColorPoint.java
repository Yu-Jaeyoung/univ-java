package src.chap05.point3;

import src.chap05.point2.Point;

public class ColorPoint extends Point {
    private String color;

    public ColorPoint() {
        super();
        System.out.println("ColorPoint 생성자 호출");
    }

    public ColorPoint(final int x, final int y, final String color) {
        super(x, y);
        this.color = color;
        System.out.println("ColorPoint Full 생성자 호출");

    }

    public void setColor(String color) {
        this.color = color;
    }

    void set(final int x, final int y, final String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    void showColorPoint() {
        System.out.print(color + ", ");
        showPoint();
    }
}

package chap06.point;

public class ColorPoint extends Point {
    private String color;

    public ColorPoint() {
        System.out.println("ColorPoint constructor executed.");
    }

    public ColorPoint(String color) {
        System.out.println("ColorPoint(String color) constructor executed.");
        this.color = color;
    }

    public ColorPoint(String color, int x, int y) {
        super(x, y);
        System.out.println("ColorPoint(String color, int x, int y) constructor executed.");
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(color);
        this.showPoint();
    }

}

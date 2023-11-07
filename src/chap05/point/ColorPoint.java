package src.chap05.point;

public class ColorPoint extends Point {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    void set(final int x, final int y, final String color) {
        set(x, y);
        this.color = color;
    }
}

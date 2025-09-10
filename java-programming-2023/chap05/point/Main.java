package chap05.point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.set(10, 20);

        point.showPoint();

        ColorPoint colorPoint = new ColorPoint();
        // colorPoint.set(10,20);
        // colorPoint.setColor("red");

        colorPoint.set(10, 20, "red");

        colorPoint.showPoint();
    }
}

package src.chap05.point3;

import src.chap05.point2.Point;

public class Main {
    public static void main(String[] args) {
        // Point point = new Point();
        // point.set(10, 20);

        Point point = new Point(10, 20);
        point.showPoint();

        // ColorPoint colorPoint = new ColorPoint();

        ColorPoint colorPoint = new ColorPoint(10, 20, "red");
        // colorPoint.set(10,20);
        // colorPoint.setColor("red");
        // colorPoint.set(10, 20, "red");

        colorPoint.showColorPoint();
    }
}

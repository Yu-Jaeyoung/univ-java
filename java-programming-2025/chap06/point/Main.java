package chap06.point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        // point.set(1, 2);
        point.showPoint();

        System.out.println("-----------------------------------------------------------------");

//      ColorPoint colorPoint = new ColorPoint();
        ColorPoint colorPoint = new ColorPoint("orange", 3, 4);
//      colorPoint.set(3, 4);
//      colorPoint.setColor("orange");
        colorPoint.showColorPoint();
    }
}

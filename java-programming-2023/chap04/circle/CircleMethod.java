package chap04.circle;

public class CircleMethod {

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(20);

        Circle circle = null;
        // System.out.println(circle.radius);


        System.out.println(circle1.radius);
        System.out.println(circle2.radius);

        circle = circle1;
        System.out.println(circle.radius);

        circle.radius++;
        System.out.println(circle1.radius);

        circle2 = circle1;
        circle2.radius++;
        System.out.println(circle1.radius);
    }
}

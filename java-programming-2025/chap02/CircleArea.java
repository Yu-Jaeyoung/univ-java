package chap02;

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.141592;

        double radius = 10.2;
        double circleArea = PI * radius * radius;

        System.out.println("반지름 " + radius + ", " + "원의 면적 = " + circleArea);
    }
}

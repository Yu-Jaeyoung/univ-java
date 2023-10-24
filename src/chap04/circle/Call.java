package src.chap04.circle;

public class Call {

    static void increase(int m) {
        m = m + 1;
        System.out.println("m = " + m);
    }

    static void increaseCircle(Circle circle) {
        circle.radius++;
        System.out.println("circle = " + circle.radius);
    }

    static void increaseArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

    static void increaseCircleArray(Circle[] circles) {
        for (int i = 0; i < circles.length; i++) {
            circles[i].radius++;
        }
    }

    public static void main(String[] args) {
        Circle[] circle = new Circle[5];

        for (int i = 0; i < circle.length; i++) {
            circle[i] = new Circle(i + 1);
        }

        increaseCircleArray(circle);

        for (int i = 0; i < circle.length; i++) {
            System.out.println(circle[i].radius);
        }

//        int[] a = {1, 2, 3, 4, 5};
//        increaseArray(a);
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

//        int n = 10;
//        increase(n);
//        System.out.println("n = " + n);
//
//        Circle pizza = new Circle(10);
//        increaseCircle(pizza);

    }
}

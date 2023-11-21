package src.chap06.object;

public class EqualsEx {
    public static void main(String[] args) {
        Point a = new Point(2, 3);
        Point b = new Point(2, 3);
        Point c = new Point(3, 4);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }

        if (a.equals(b)) {
            System.out.println("a is equals to b");
        } else {
            System.out.println("a is not equals to b");
        }

        if (a.equals(c)) {
            System.out.println("a is equals to c");
        } else {
            System.out.println("a is not equals to c");
        }
    }
}

package src.chap01;

public class LogicOperator {
    public static void main(String[] args) {
        boolean result = (3 >= 2);
        System.out.println(result);

        System.out.println(3 == 2);

        System.out.println(!true);
        System.out.println(!(3 == 2));

        System.out.println(true && false);
        System.out.println(true || false);

        System.out.println((3 != 2) || (-1 > 0));

    }
}

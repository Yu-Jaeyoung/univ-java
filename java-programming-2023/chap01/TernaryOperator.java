package chap01;

public class TernaryOperator {
    public static void main(String[] args) {

        int a = 3, b = 5;

        int big;

        if (a > b) {
            big = a;
        } else {
            big = b;
        }

        System.out.println(big);

        int big2 = a > b ? a : b;
        System.out.println(big2);

        int diff = (a > b) ? (a - b) : (b - a);
        System.out.println(diff);
    }
}

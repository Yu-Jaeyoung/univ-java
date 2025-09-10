package chap02;

import java.util.Scanner;

public class InfinityAndNaNCheckEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = 5;
        double y = scanner.nextDouble();

        double z = x / y;

        System.out.println(z);

        if (Double.isInfinite(z)) {
            System.out.println("값 산출 불가");
        } else {
            double a = z + 2;
            System.out.println(a);
        }

        scanner.close();
    }
}

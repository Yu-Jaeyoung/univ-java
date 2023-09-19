package src.chap02.loop;

import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int number = 0;

        System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");

        while ((number = scanner.nextInt()) != 0) {
            sum += number;
            count++;
        }

        System.out.printf("Sum = %.0f, Avg = %.2f, Count = %d\n",
                sum, sum / count, count);

        scanner.close();
    }
}

package chap03.continuebreak;

import java.util.Scanner;

public class ContinueEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();

            sum += number;
        }

        System.out.println("합계는 " + sum + "입니다.");

        scanner.close();
    }
}

package exercise.week3;

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("0보다 큰 정수를 입력하시오.");
        } else {
            System.out.println(number + " 단");
            for (int i = 1; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }
        }

        scanner.close();
    }
}

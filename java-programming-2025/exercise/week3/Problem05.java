package exercise.week3;

import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        System.out.print("숫자를 입력하시오: ");

        int inputNumber;

        do {
            inputNumber = scanner.nextInt();
            if (inputNumber != 0) {
                sum += inputNumber;
                count++;
            }
        } while (inputNumber != 0);

        System.out.println(sum / count);

        scanner.close();
    }
}

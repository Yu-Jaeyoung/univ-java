package exercise.week03;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 단을 입력하세요 (2~9): ");

//        if (!scanner.hasNextInt()) {
//            System.out.println("잘못된 입력입니다.");
//            return;
//        }

        int dan = scanner.nextInt();

        if (dan < 2 || dan > 9) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        for (int multiplier = 1; multiplier <= 9; multiplier++) {
            System.out.printf("%d X %d = %d%n", dan, multiplier, dan * multiplier);
        }
    }
}

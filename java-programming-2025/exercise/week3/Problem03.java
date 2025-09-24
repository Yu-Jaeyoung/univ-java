package exercise.week3;

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("월을 입력하시오(1월 ~ 12월): ");
        int number = scanner.nextInt();

        switch (number) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.print(number + "월은 31일까지 있습니다.");
                break;
            case 4, 6, 9, 11:
                System.out.println(number + "월은 30일까지 있습니다.");
                break;
            case 2:
                System.out.println(number + "월은 28일 혹은 29일까지 있습니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }

        scanner.close();
    }
}

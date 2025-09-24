package chap03.continuebreak;

import java.util.Scanner;

public class BreakEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            String input = scanner.nextLine();
            System.out.println(input);
            if (input.equals("exit")) {
                break;
            }
        }

        System.out.println("프로그램을 종료합니다.");

        scanner.close();
    }
}

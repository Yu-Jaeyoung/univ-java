package exercise.week03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String operator = scanner.next();

            if (!operator.equals("+") && !operator.equals("-")
                    && !operator.equals("*") && !operator.equals("/")) {
                System.out.println("잘못된 연산자입니다.");
                return;
            }

//            if (!scanner.hasNextInt()) {
//                System.out.println("정수를 입력해 주세요.");
//                scanner.nextLine();
//                continue;
//            }
            int leftOperand = scanner.nextInt();

//            if (!scanner.hasNextInt()) {
//                System.out.println("정수를 입력해 주세요.");
//                scanner.nextLine();
//                continue;
//            }
            int rightOperand = scanner.nextInt();

            switch (operator) {
                case "+":
                    add(leftOperand, rightOperand);
                    break;
                case "-":
                    subtract(leftOperand, rightOperand);
                    break;
                case "*":
                    multiply(leftOperand, rightOperand);
                    break;
                case "/":
                    divide(leftOperand, rightOperand);
                    break;
            }
        }
    }

    public static void add(int leftOperand, int rightOperand) {
        System.out.printf("%d + %d = %d%n", leftOperand, rightOperand, leftOperand + rightOperand);
    }

    public static void subtract(int leftOperand, int rightOperand) {
        System.out.printf("%d - %d = %d%n", leftOperand, rightOperand, leftOperand - rightOperand);
    }

    public static void multiply(int leftOperand, int rightOperand) {
        System.out.printf("%d * %d = %d%n", leftOperand, rightOperand, leftOperand * rightOperand);
    }

    public static void divide(int leftOperand, int rightOperand) {
        if (rightOperand == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return;
        }
        System.out.printf("%d / %d = %d%n", leftOperand, rightOperand, leftOperand / rightOperand);
    }
}

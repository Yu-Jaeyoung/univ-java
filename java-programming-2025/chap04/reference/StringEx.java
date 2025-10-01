package chap04.reference;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        String name1 = "홍길동";
        String name2 = "홍길동";

        if (name1 == name2) {
            System.out.println("name1과 name2의 참조가 같음");
        } else {
            System.out.println("name1과 name2가 참조가 다름");
        }

        if (name1.equals(name2)) {
            System.out.println("name1과 name2의 문자열이 같음");
        }

        String name3 = new String("홍길동");
        String name4 = new String("홍길동");

        if (name3 == name4) {
            System.out.println("name3과 name4가 참조가 같음");
        } else {
            System.out.println("name3과 name4가 참조가 다름");
        }

        if (name3.equals(name4)) {
            System.out.println("name3과 name4의 문자열이 같음");
        }

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input == "홍길동") {
            System.out.println("입력 값이 홍길동입니다.");
        } else if (input == name1) {
            System.out.println("입력 값이 name1과 같은 홍길동입니다.");
        } else if (input.equals("홍길동")) {
            System.out.println("입력 값은 문자열 홍길동입니다.");
        }

        scanner.close();
    }
}

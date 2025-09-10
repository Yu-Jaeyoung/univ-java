package chap02;

import java.util.Scanner;

public class Twenties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        System.out.println(age);

        if (age >= 20 && age < 30) {
            System.out.println("20대입니다.");
            System.out.println("Happy!");
        } else if (age >= 10 && age < 20) {
            System.out.println("10대입니다.");
        } else {
            System.out.println("10대도 아니고 20대도 아닙니다.");
        }
    }
}

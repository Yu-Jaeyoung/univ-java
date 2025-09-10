package chap02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String city = scanner.next();
        int age = scanner.nextInt();

        System.out.println("이름: " + name);
        System.out.println("도시: " + city);
        System.out.println("나이: " + age);
    }
}

package src.chap01;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("이름 : " + name);

        String city = scanner.next();
        System.out.println("도시 : " + city);

        int age = scanner.nextInt();
        System.out.println("나이 : " + age);

        double score = scanner.nextDouble();
        System.out.println("성적 : " + score);

        scanner.close();
    }
}

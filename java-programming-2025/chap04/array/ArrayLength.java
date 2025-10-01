package chap04.array;

import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[4];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        System.out.println("합: " + sum);
        System.out.println("평균: " + ((double) sum / intArray.length));

        scanner.close();
    }
}

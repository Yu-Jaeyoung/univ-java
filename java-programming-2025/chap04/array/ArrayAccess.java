package chap04.array;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[5];

        for (int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(intArray[i]);
        }

        scanner.close();
    }
}

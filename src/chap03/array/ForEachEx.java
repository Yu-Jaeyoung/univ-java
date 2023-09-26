package src.chap03.array;

import java.util.Scanner;

public class ForEachEx {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // int[] intArray = new int[5];

        // for (int i = 0; i < intArray.length; i++) {
        //     intArray[i] = scanner.nextInt();
        // }

        // for (int e : intArray) {
        //     System.out.println(e);
        // }

        // scanner.close();

        String[] fruits = {"사과", "배", "바나나", "체리", "딸기", "포도"};

        for (String e : fruits) {
            System.out.println(e);
        }
    }
}

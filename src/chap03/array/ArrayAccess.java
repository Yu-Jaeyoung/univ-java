package src.chap03.array;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        // int intArray1[]; -> 배열을 가르킬 수 있는 변수만 선언한 것

        // intArray1 = new int[5]; -> 배열 생성

        // int intArray2[] = new int[5];

        // int[] intArray3 = new int[5];

        // int intArray4[] = {1, 2, 3, 4, 5};

        // int[] intArray = new int[6];

        // intArray[0] = 1;
        // intArray[1] = 2;
        // intArray[2] = 3;
        // intArray[3] = 4;
        // intArray[4] = 5;
        // intArray[5] = 6;

        // int[] intArray = {1, 2, 3, 4, 5, 6, 7};

        // for (int i = 0; i < intArray.length; i++) {
        // System.out.printf("intArray[%d] = %d\n", i, intArray[i]);
        // }

        // System.out.println("length = " + intArray.length);

        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("intArray[%d] = %d\n", i, intArray[i]);
        }

        double sum = 0.0;

        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        System.out.printf("합은 %.0f, 평균은 %.0f입니다.\n", sum, sum / intArray.length);

        scanner.close();
    }
}

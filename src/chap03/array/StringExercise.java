package src.chap03.array;

import java.util.Scanner;

// 문자열을 읽어서 원하는 문자열이 나타나면 종료하는 프로그램을 완성하시오.
public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = new String[10];

        /**
         for (int i = 0; i < inputs.length; i++) {
         inputs[i] = scanner.nextLine();
         }

         for (String input : inputs) {
         System.out.println(input);
         }

         String input;
         for (int i = 0; i < inputs.length; i++) {

         input = scanner.nextLine();

         if (input.equals("exit")) {
         // if (input == "d") { ! 의도와 다른 표현 !
         for (int j = 0; j < i; j++) {
         System.out.println(inputs[j]);
         }
         break;
         }

         inputs[i] = input;
         }
         */


        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.nextLine();
        }

        for (String input : inputs) {
            System.out.println(input);
        }

        int count = 0;

        for (String input : inputs) {
            if (input.equals("d")) {
                // if (input == "d") { ! 의도와 다른 표현 !
                count++;
            }
        }

        System.out.println("Count = " + count);
        scanner.close();
    }
}

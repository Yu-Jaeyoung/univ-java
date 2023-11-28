package src.chap08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dividend; // 나뉨수
        int divisor; // 나눔수

        try {
            // System.out.print("나뉨수를 입력하시오: ");
            dividend = scanner.nextInt();
            // System.out.print("나눗수를 입력하시오: ");
            divisor = scanner.nextInt();

            System.out.println(dividend / divisor);
        } catch (ArithmeticException e) {
            System.out.println("수식 오류 " + e.getMessage());
            // e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("입력 오류" + e.getMessage());
        } catch (Exception e) {
            System.out.println("기타 등등 " + e.getMessage());
        } finally {
            System.out.println("수행 끝");
        }

        scanner.close();

//      findClass();

//      findClass2();
    }

//    public static void findClass() throws ClassNotFoundException {
//        Class<?> clazz = Class.forName("java.lang.String2");
//    }
//
//    public static void findClass2(){
//            Class<?> clazz = Class.forName("java.lang.String2");
//    }
}

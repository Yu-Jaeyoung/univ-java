package chap03.loop;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;
        int count = 0;

        while ((n = sc.nextInt()) > 0) {
            sum += n;
            count++;
        }

        System.out.println(sum);
        System.out.println(sum / count);

        sc.close();
    }
}

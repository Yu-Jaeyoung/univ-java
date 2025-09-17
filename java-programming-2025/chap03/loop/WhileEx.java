package chap03.loop;

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;
        int count = 0;

        do {
            n = sc.nextInt();
            sum += n;
            count++;
        } while (n > 0);

        System.out.println(sum);
        System.out.println(sum / count);

        sc.close();

    }
}

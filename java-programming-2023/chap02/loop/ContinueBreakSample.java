package chap02.loop;

import java.util.Scanner;

public class ContinueBreakSample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int number = 0;

        System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");

        while ((number = scanner.nextInt()) != 0) {
            // 음수는 계산에서 제외
            if (number < 0) {
                continue;
            }

            // 100을 초과하는 숫자가 입력되면 종료
            if (number > 100) {
                break;
            }

            sum += number;
            count++;
        }

        System.out.printf("Sum = %.0f, Avg = %.2f, Count = %d\n",
                sum, sum / count, count);

        scanner.close();
    }
}

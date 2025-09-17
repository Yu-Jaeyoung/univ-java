package chap03.loop;

public class ForEx {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum += i;
        }

        System.out.println("합계는 " + sum + "입니다.");


        sum = 0;
        int i;
        for (i = 0; i <= 100; i++) {
            sum += i;
        }

        System.out.println("반복에 사용된 i의 값은 " + i + "입니다.");
        System.out.println("합계는 " + sum + "입니다.");

        for (; ; ) {
            System.out.println("*");
        }
    }
}

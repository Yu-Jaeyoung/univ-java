package chap01;

public class ArithmeticOperator {
    public static void main(String[] args) {

        int time = 10000;
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;

        System.out.println(hour + "시간 " + minute + "분 " + second + "초");
    }
}

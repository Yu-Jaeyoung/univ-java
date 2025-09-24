package exercise.week3;

public class Problem02 {
    public static void main(String[] args) {

        int number = 1;
        int sum = 0;

        while (number <= 10) {
            sum += number;
            number++;
        }

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}

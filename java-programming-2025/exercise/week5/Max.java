package exercise.week5;

public class Max {
    public static void main(String[] args) {
        int[] numbers = {18, 5, 30, -4, 15};

        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("배열의 최댓값은 " + max + "입니다.");
    }
}

package src.chap03.array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] array = {5, 1, 100, 50, 60, 80};

        int min = array[0];

        /**
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        */

        // 향상된 for문 사용
        for (int number : array) {
            if (number < min)
                min = number;
        }

        System.out.println("min: " + min);
    }
}

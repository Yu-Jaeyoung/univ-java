package src.chap02.loop;

public class Gugudan {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %2d        ", i, j, i * j);
            }
            System.out.println();
        }
    }
}

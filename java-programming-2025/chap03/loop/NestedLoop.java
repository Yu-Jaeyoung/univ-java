package chap03.loop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%-10s\t", i + "단");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d * %d = %2d\t", j, i, i*j);
            }
            System.out.println();
        }
    }
}

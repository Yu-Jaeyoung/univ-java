package chap06.lib;

public class ACalculator extends Calculator {
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        double sum = 0;

        for (int number : a) {
            sum += number;
        }

        return sum / a.length;
    }
}

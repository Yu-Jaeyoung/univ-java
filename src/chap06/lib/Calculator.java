package src.chap06.lib;

public abstract class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public abstract int subtract(int a, int b);

    public abstract double average(int[] a);
}

// abstract class, 추상 클래스
// 객체를 생성할 수 없음
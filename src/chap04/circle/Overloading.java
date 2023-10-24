package src.chap04.circle;

public class Overloading {
    public static void main(String[] args) {
        MethodSample methodSample = new MethodSample();

        System.out.println(methodSample.getSum(1, 2));

        System.out.println(methodSample.getSum(1, 2, 3));

        System.out.println(methodSample.getSum(1.0, 2.0));
    }
}

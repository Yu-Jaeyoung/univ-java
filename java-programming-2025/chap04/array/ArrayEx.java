package chap04.array;

public class ArrayEx {
    public static void main(String[] args) {
        int[] intArray; // 정수 배열에 대한 참조변수

        intArray = new int[5];

        intArray[0] = 10;
        intArray[2] = 5;

        int[] intArray3 = {1, 2, 3, 4, 5};
        System.out.println(intArray3[4]);

        double[] doubleArray = {0.01, 0.02, 0.03, 0.04};
        System.out.println(doubleArray[2]);

        int[] intArray4 = intArray3;
        System.out.println(intArray4[4]);

        intArray4[1] = 10;
        System.out.println(intArray3[1]);
    }
}

package src.chap03.array;

public class ReturnArray {
    static int[] makeArray() {
        // int temp[] = {1, 2, 3, 4, 5};
        int temp[] = new int[4];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i + 1;
        }
        return temp;
    }

    public static void main(String[] args) {
        int intArray[];
        intArray = makeArray();
        for (int value : intArray) {
            System.out.println(value);
        }
    }
}

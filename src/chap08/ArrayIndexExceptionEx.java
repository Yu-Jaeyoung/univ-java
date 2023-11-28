package src.chap08;

public class ArrayIndexExceptionEx {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        try {
            intArray[0] = 10;
            intArray[3] = 5;
            intArray[5] = 7;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 범위가 잘못됐어요!");
        } catch (Exception e) {
            System.out.println("뭔가 잘못됐어요 " + e.getMessage());
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}

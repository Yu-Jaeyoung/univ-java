package src.chap03.reference;

public class NullEx {
    public static void main(String[] args) {
        String str = "홍길동";
        // String str = null; -> NullPointException
        System.out.print(str.length());
    }
}

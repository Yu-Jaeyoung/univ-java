package src.chap03.array;

public class StringArrayEx {
    public static void main(String[] args) {
        String[] strArray; // 스택 영역에 할당

        strArray = new String[5]; // 힙 영역에 할당

        strArray[0] = "Java"; // 객체 연결
        strArray[1] = "Java"; // strArray[0]과 동일한 객체에 연결
        strArray[2] = new String("Java"); // 새로운 객체에 연결
        strArray[3] = "Python";
        strArray[4] = "C";

        for (String s : strArray) {
            System.out.println(s);
        }
    }
}

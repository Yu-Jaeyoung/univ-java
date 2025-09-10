package chap02;

public class Type {
    public static void main(String[] args) {
        String toolName = "JDK";
        System.out.println(toolName + 21.0);

        long m = 25;
        double d = 3.14 * 10;
        System.out.println(m);
        System.out.println(d);

        // 강제 타입 변환
        byte n = (byte) 1000;
        System.out.println(n);

        double d2 = 1.29;
    }
}

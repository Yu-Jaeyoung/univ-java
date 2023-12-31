package src.chap01;

public class AssignmentIncDecOperator {
    public static void main(String[] args) { // 대입 연산자 사례
        int a = 3, b = 3, c = 3;
        a += 3; // a = a + 3 = 6
        b *= 3; // b = b * 3 = 9
        c %= 2; // c = c % 2 = 1
        System.out.println("a = " + a + ", b = " + b + ", c = " + c); // 증감 연산자 사례
        int d = 3;
        a = d++; // a = 3, d = 4
        System.out.println("a = " + a + ", d = " + d);
        a = ++d; // a = 5, d = 5
        System.out.println("a = " + a + ", d = " + d);
        a = d--; // a = 5, d = 4
        System.out.println("a = " + a + ", d = " + d);
        a = --d; // a = 3, d = 3
        System.out.println("a = " + a + ", d = " + d);
    }
}

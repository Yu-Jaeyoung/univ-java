package chap01;

public class CharEx {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = '난';
        char ch3 = '5';
        char ch4 = 100;

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);

        System.out.println("# of bits of char : " + Character.SIZE);
        System.out.println("# of bits of double : " + Double.SIZE);
        System.out.println("# of bits of int : " + Integer.SIZE);
    }
}

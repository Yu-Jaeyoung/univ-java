package src.chap03.reference;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "YuJaeyoung";
        String strVar2 = "YuJaeyoung";

        // System.out.println(System.identityHashCode(strVar1));
        // System.out.println(System.identityHashCode(strVar2));

        boolean diff = strVar1 == strVar2;
        System.out.println(diff);

        boolean diffContent = strVar1.equals(strVar2);
        System.out.println(diffContent);

        String strVar3 = new String("YuJaeyoung");
        String strVar4 = new String("YuJaeyoung");

        boolean diff2 = strVar3 == strVar4;
        System.out.println(diff2);

        //  equals는 참조값을 따라가서 실제 값을 비교

        boolean diffContent2 = strVar3.equals(strVar4);
        System.out.println(diffContent2);

        boolean diffContent3 = strVar1.equals(strVar4);
        System.out.println(diffContent3);

        if (strVar3.equals(strVar4)) {
            System.out.println("[1] strVar3과 strVar4는 문자열이 같음(같은 내용임)");
        }

        if (strVar3 == strVar4) {
            System.out.println("[2] strVar3과 strVar4는 문자열이 같음(같은 내용임)");
        }
    }
}

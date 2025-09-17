package chap03.condition;

public class SwitchEx2 {
    public static void main(String[] args) {
        String answer = "예";

        switch (answer) {
            case "예":
                System.out.println("긍정 응답");
                break;
            case "아니오":
                System.out.println("부정 응답");
                break;
            default:
                System.out.println("잘못된 응답");
        }
    }
}

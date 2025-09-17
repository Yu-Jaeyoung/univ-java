package chap03.condition;

public class SwitchEx {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("90점 이상입니다.");
                break;
            case 'B':
                System.out.println("80점 이상, 90점 미만입니다.");
                break;
            case 'C':
                System.out.println("70점 이상, 80점 미만입니다.");
                break;
            case 'D':
                System.out.println("60점 이상, 70점 미만입니다.");
                break;
            case 'F':
                System.out.println("60점 미만입니다.");
                break;
            default:
                System.out.println("잘못된 정보입니다.");
        }
    }
}

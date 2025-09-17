package chap03.condition;

public class IfEx {
    public static void main(String[] args) {
        int n = 11;

        if (n % 2 == 0) {
            System.out.println(n + "은 짝수입니다.");
        } else {
            System.out.println(n + "은 홀수입니다.");
        }

        int score = 90;
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(grade);
    }
}

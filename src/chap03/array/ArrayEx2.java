package src.chap03.array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        int subjectNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------------------------------");
            System.out.println("1. 과목수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택: ");
            int selectNum = scanner.nextInt();

            if (selectNum == 1) {

                // 과목수
                System.out.print("과목수: ");
                subjectNum = scanner.nextInt();

                if (subjectNum < 1) {
                    System.out.println(" 과목수는 0 이상입니다. ");
                    continue;
                }

                scores = new int[subjectNum];

            } else if (selectNum == 2) {

                if (scores == null) {
                    System.out.println(" 점수 배열이 생성되지 않았습니다. ");
                    continue;
                }

                // 점수 입력
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = scanner.nextInt();
                }

            } else if (selectNum == 3) {

                if (scores == null) {
                    System.out.println(" 점수 배열이 생성되지 않았습니다. ");
                    continue;
                }

                // 점수 리스트를 확인
                int j = 1;
                for (int score : scores) {
                    System.out.println("과목" + j + " 점수: " + score);
                    j++;
                }

                System.out.println("--------------------------------------------------");

                for (int i = 0; i < scores.length; i++) {
                    System.out.println("과목" + (i + 1) + " 점수: " + scores[i]);
                }

            } else if (selectNum == 4) {

                if (scores == null) {
                    System.out.println(" 점수 배열이 생성되지 않았습니다. ");
                    continue;
                }

                // 최고 점수와 평균 점수를 구하는 코드
                int max = scores[0];

                for (int i = 1; i < scores.length; i++) {
                    if (scores[i] > max)
                        max = scores[i];
                }

                double sum = 0;
                for (int score : scores) {
                    sum += score;
                }

                System.out.println("평균 점수: " + sum / scores.length);

            } else if (selectNum == 5) {
                break;
            }
        }
        System.out.println("프로그램 종료");
        scanner.close();
    }
}

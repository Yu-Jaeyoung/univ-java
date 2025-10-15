package exercise.week5;

public class ScoreAverage {
    public static void main(String[] args) {
        double[][] score = {
                {3.5, 3.0, 4.5, 4.0, 3.5, 3.0}, // 1학년 1학기
                {3.5, 3.5, 2.5, 4.5, 4.0},      // 1학년 2학기
                {3.5, 4.0, 3.5, 3.0, 4.5, 4.0}, // 2학년 1학기
                {4.0, 4.0, 4.5, 4.5, 4.5}       // 2학년 2학기
        };

        double totalSum = 0;
        int totalCount = 0;

        for (int semester = 0; semester < score.length; semester++) {
            int year = semester / 2 + 1;
            int term = semester % 2 + 1;

            System.out.printf("%d학년 %d학기 성적 : ", year, term);

            double semesterSum = 0.0;

            for (int j = 0; j < score[semester].length; j++) {
                System.out.printf("%.1f  ", score[semester][j]);
                semesterSum += score[semester][j];
            }

            int semesterCount = score[semester].length;
            double semesterAvg = semesterSum / semesterCount;

            System.out.printf("\n          과목수 : %d, 평균: %.2f\n\n", semesterCount, semesterAvg);

            totalSum += semesterSum;
            totalCount += semesterCount;
        }

        double totalAvg = totalSum / totalCount;
        System.out.printf("지금까지 총 %d개 과목을 수강했고 전체 평점은 %.2f입니다.", totalCount, totalAvg);
    }
}
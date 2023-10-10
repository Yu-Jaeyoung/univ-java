package src.chap03.array;

public class ScoreAverageEx {
    public static void main(String[] args) {
        double[][] scores = {
                {3.5, 3.0, 4.5, 4.0, 3.5, 3.0}, // 1학년 1학기 과목별 성적
                {3.5, 3.5, 2.5, 4.5, 4.0},      // 1학년 2학기 과목별 성적
                {3.5, 4.0, 3.5, 3.0, 4.5, 4.0}, // 2학년 1학기 과목별 성적
                {4.0, 4.0, 4.5, 4.5, 4.5}       // 2학년 2학기 과목별 희망 성적
        };

        double sum = 0;  // 전체 과목 성적 합계
        int count = 0;       // 전체 과목 수

        for (int semester = 0; semester < scores.length; semester++) {  // 각 학기별로 반복
            double semesterSum = 0;
            System.out.print((semester + 1) + "학기 성적 : ");
            for (int subject = 0; subject < scores[semester].length; subject++) {
                semesterSum += scores[semester][subject];
                count++;
                System.out.print(scores[semester][subject] + " ");
            }
            System.out.printf("\n     과목수 : " + scores[semester].length + ", 평균 : %.2f\n", semesterSum / scores[semester].length);

            sum += semesterSum;
        }
        System.out.printf("\n전체 %d개 과목을 수강했고 전체 평점은 %.2f입니다.", count, sum / count);
    }

}

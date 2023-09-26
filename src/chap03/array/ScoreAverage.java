package src.chap03.array;

public class ScoreAverage {
    public static void main(String[] args) {
        double[][] score = {
                {3.3, 3.4}, {3.5, 3.6}, {3.7, 3.8}, {4.2, 4.5}
        };

        for (int year = 0; year < score.length; year++) {
            System.out.printf("%d학년 : ", year + 1);
            for (int term = 0; term < score[0].length; term++) {
                System.out.print("    " + score[year][term]);
            }
            System.out.println();
        }

        System.out.println();

        for (int year = 0; year < score.length; year++) {
            System.out.printf("%d학년 : ", year + 1);
            double[] yearScore = score[year];
            for (int term = 0; term < yearScore.length; term++) {
                System.out.print("    " + yearScore[term]);
            }
            System.out.println();
        }
    }
}

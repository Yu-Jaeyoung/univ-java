package chap04.array;

public class ScoreArray {
    public static void main(String[] args) {

        double[][] scores = {
                {3.3, 3.4}
                , {3.5, 3.6}
                , {3.7, 3.8}
                , {4.0, 4.1}
        };

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[0].length; j++) {
                System.out.println(scores[i][j]);
            }
        }

        System.out.println(scores.length);
        System.out.println(scores[0].length);


        for(int year = 0; year < scores.length; year++){
            for(int term = 0; term < scores[0].length; term++){
                System.out.println(scores[year][term]);
            }
        }
    }
}

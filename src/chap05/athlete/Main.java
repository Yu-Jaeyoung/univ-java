package src.chap05.athlete;

public class Main {
    public static void main(String[] args) {
        Athlete[] athletes = new Athlete[4];
        athletes[0] = new BaseballPlayer("김길동", 175.3, 75.3, "1루수");
        athletes[1] = new BasketballPlayer("박길동", 182.4, 78, "농구선수");
        athletes[2] = new BasketballPlayer("황길동", 181.7, 77, "농구선수");
        athletes[3] = new BaseballPlayer("유길동", 176.8, 73, "2루수");

        for (Athlete athlete : athletes) {
            athlete.print();
            System.out.println("==================");
        }
    }
}

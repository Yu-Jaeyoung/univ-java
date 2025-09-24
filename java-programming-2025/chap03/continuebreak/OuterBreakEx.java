package chap03.continuebreak;

public class OuterBreakEx {
    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= 2) {
                    break outer;
                    // continue outer;
                }
                System.out.println(i + "," + j);
            }
        }
        System.out.println("for(j) end");
    }
}

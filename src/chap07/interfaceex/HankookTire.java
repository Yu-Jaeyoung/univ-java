package src.chap07.interfaceex;

public class HankookTire implements Tire {
    @Override
    public void roll() {
        System.out.println("한국 타이어");
    }
}

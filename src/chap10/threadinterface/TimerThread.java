package src.chap10.threadinterface;

public class TimerThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("띵");

            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println("강제 종료됨 !!");
                return;
            }
        }
    }
}

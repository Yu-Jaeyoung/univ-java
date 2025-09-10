package chap10.threadclass;

public class TimerThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("띵");

            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

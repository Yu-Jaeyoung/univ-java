package src.chap10.threadclass;

public class Main {
    // main thread
    public static void main(String[] args) {
        // thread 생성
        Thread thread = new TimerThread();
        thread.start();

        Thread beepThread = new BeepThread();
        beepThread.start();

        Thread beepThread2 = new BeepThread();
        beepThread2.start();

        System.out.println("메인 스레드");
    }
}

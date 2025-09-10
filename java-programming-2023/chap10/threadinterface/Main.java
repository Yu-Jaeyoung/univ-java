package chap10.threadinterface;

public class Main {
    // main thread
    public static void main(String[] args) {
        // thread 생성
        Thread thread = new TimerThread();
        thread.start();

        Runnable beepTask = new BeepTask();
        Thread beepThread = new Thread(beepTask);
        beepThread.start();

        Thread beepThread2 = new Thread(new BeepTask());
        beepThread2.start();

        System.out.println("메인 스레드");

        thread.interrupt();
    }
}

package chap10.threadclass;

import java.awt.*;

public class BeepThread extends Thread {

    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep();
            try {
                sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

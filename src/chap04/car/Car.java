package src.chap04.car;

public class Car {
    // 멤버 변수는 private을 사용하는 것이 원칙
    private int speed;
    private boolean stop;

    public int getSpeed() { // getter
        return speed;
    }

    public void setSpeed(int speed) { // setter
        this.speed = speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}

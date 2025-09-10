package chap07.interfaceex2;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();

        // 인터페이스 참조 변수가 인터페이스를 구현한 클래스 객체를 참조할 수 있음
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.turnOff();

        rc.setMute(true);
    }
}

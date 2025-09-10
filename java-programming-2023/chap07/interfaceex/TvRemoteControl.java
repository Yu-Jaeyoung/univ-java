package chap07.interfaceex;

public class TvRemoteControl implements RemoteControl{
    @Override
    public void changeBattery() {
        System.out.println("TV 리모콘 배터리 교체");
    }
}

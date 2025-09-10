package chap07.interfaceex;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new TvRemoteControl();
        remoteControl.changeBattery();
    }
}

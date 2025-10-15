package exercise.week5;

public class TrafficLightExample {

    public enum TrafficLight {
        RED,
        YELLOW,
        GREEN
    }

    public static void main(String[] args) {
        TrafficLight currentLight = TrafficLight.GREEN;

        System.out.println("현재 신호등 색상: " + currentLight);
        System.out.print("동작 메시지: ");

        switch (currentLight) {
            case RED:
                System.out.println("정지하세요.");
                break;
            case YELLOW:
                System.out.println("주의하세요.");
                break;
            case GREEN:
                System.out.println("진행하세요.");
                break;
            default:
                System.out.println("잘못된 신호등 색상입니다.");
        }
    }
}
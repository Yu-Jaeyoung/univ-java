package chap04.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(100);


        if (car.isStop()) {
            System.out.println("멈춰있어요 !!");
        } else {
            System.out.println(car.getSpeed());
        }
    }
}

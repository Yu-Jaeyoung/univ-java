package chap07.abstractclass.animal;

public class MovableMain {
    public static void main(String[] args) {
        Car car = new Car("테슬라", 2023);
        car.move();

        MovableCat cat = new MovableCat("나비");
        cat.sound();
        cat.move();
    }
}

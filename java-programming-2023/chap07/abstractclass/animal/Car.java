package chap07.abstractclass.animal;

public class Car implements Movable {

    private final String type;
    private final int year;

    public Car(final String type, final int year) {
        this.type = type;
        this.year = year;
    }

    @Override
    public void move() {
        System.out.println(year + "에 출시된 " + type + " 차량이 움직입니다.");
    }
}

package src.chap07.abstractclass.animal;

public class MovableCat extends Animal implements Movable {

    MovableCat(final String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(this.getName() + "가 야옹합니다.");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " 고양이가 움직입니다.");
    }
}

package src.chap07.abstractclass.animal;

public class Cat extends Animal {
    public Cat(final String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(this.getName() + " 소리를 냅니다. 야옹");
    }
}

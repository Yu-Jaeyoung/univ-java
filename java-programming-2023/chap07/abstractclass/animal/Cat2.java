package chap07.abstractclass.animal;

public class Cat2 extends Animal2 {
    public Cat2(final String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println(this.getName()+"은 야옹");
    }
}

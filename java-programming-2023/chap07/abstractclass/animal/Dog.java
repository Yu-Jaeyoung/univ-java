package chap07.abstractclass.animal;

public class Dog extends Animal {
    public Dog(final String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(this.getName() + "소리를 냅니다. 멍멍");
    }
}

package chap07.abstractclass.animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("개냥이");
        Dog dog = new Dog("멍돌이");
        Person me = new Person("jack", 2);
        me.addCompanions(cat);
        me.addCompanions(dog);

        me.soundAll();
    }
}

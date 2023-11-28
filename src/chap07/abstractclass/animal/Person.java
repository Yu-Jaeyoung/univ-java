package src.chap07.abstractclass.animal;

public class Person {
    private final String name;

    // 1. 배열 생성 같이 진행
    // public Animal[] companions = new Animal[10];

    // 2. 배열은 생성자에서 생성
    private final Animal[] companions;
    private int companionCount;

    public Person(final String name, final int count) {
        this.name = name;
        this.companions = new Animal[count];
        this.companionCount = 0;
    }

    public void addCompanions(final Animal animal) {
        // animal을 삽입힐 위치를 알야아 함.
        this.companions[this.companionCount] = animal;
        this.companionCount++;
    }

    public void soundAll() {
        for (Animal animal : companions) {
            animal.sound();
        }
    }
}

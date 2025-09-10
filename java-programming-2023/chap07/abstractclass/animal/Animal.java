package chap07.abstractclass.animal;

// 추상 메소드를 포함한다면 추상 클래스이어야함
public abstract class Animal {
    private final String name;

    Animal(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void sound(); // 추상 메소드
}

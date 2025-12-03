package exercise.week14;

public class Warrior extends Character implements Attackable {
    private final int attack;
    private final int defense;

    public Warrior(String name, int level, int maxHp, int attack, int defense) {
        super(name, level, maxHp);
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public void printInfo() {
        System.out.println("이름: " + getName());
        System.out.println("레벨: " + getLevel());
        System.out.println("현재 체력: " + getHp());
        System.out.println("최대 체력: " + getMaxHp());
        System.out.println("공격력: " + attack);
        System.out.println("방어력: " + defense);
    }

    @Override
    public void powerAttack() {
        System.out.println("강력한 공격! 공격력: " + (attack * 2));
    }
}
package exercise.week13;

public class Warrior extends Character {
    private final int attack;
    private final int defense;

    public Warrior(String name, int level, int maxHp, int attack, int defense) {
        super(name, level, maxHp);
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("공격력: " + attack);
        System.out.println("방어력: " + defense);
    }

    public void powerAttack() {
        System.out.println("강력한 공격! 공격력: " + (attack * 2));
    }
}
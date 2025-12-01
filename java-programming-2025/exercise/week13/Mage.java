package exercise.week13;

public class Mage extends Character {
    private final int magic;
    private int mp;
    private final int maxMp;

    public Mage(String name, int level, int maxHp, int magic, int maxMp) {
        super(name, level, maxHp);
        this.magic = magic;
        this.maxMp = maxMp;
        this.mp = maxMp;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("마법력: " + magic);
        System.out.println("마나: " + mp + "/" + maxMp);
    }

    public void castSpell(int mpCost) {
        if (mpCost > mp) {
            System.out.println("마나가 부족합니다!");
            return;
        }
        mp -= mpCost;
        System.out.println("마법 시전! 남은 마나: " + mp + "/" + maxMp);
    }
}
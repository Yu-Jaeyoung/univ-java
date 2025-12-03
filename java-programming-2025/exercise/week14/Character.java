package exercise.week14;

public abstract class Character {
    private final String name;
    private int level;
    private int hp;
    private final int maxHp;

    public Character(String name, int level, int maxHp) {
        this.name = name;
        this.level = level;
        this.maxHp = maxHp;
        this.hp = maxHp;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    abstract public void printInfo();

    public void takeDamage(int damage) {
        hp -= damage;

        if (hp < 0) {
            hp = 0;
        }

        System.out.println(name + "이(가) " + damage + "의 데미지를 받았습니다!");
    }

    public void levelUp() {
        level++;
        System.out.println(name + "의 레벨이 " + level + "로 올랐습니다!");
    }
}
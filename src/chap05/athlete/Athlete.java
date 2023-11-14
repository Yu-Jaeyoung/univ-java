package src.chap05.athlete;

public class Athlete {
    private final String name;
    private final double height;
    private final double weight;

    public Athlete(final String name, final double height, final double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.height);
        System.out.println(this.weight);
    }
}

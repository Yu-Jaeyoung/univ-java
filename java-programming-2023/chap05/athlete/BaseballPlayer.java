package chap05.athlete;

public class BaseballPlayer extends Athlete {
    private final String position;

    public BaseballPlayer(final String name, final double height, final double weight, final String position) {
        super(name, height, weight);
        this.position = position;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(position);
    }
}

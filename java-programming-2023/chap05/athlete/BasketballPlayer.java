package chap05.athlete;

public class BasketballPlayer extends Athlete {
    private final String jobTitle;

    public BasketballPlayer(final String name, final double height, final double weight, final String jobTitle) {
        super(name, height, weight);
        this.jobTitle = jobTitle;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(jobTitle);
    }
}

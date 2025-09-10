package chap05.person;

public class StudentWorker extends Student {
    private String jobTitle;

    public StudentWorker(final String name, final String id, final String department, final double grade,
                         final String jobTitle) {
        super(id, name, department, grade);
        this.jobTitle = jobTitle;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.jobTitle);
    }

    public void print3() {
        print2();
        System.out.println(jobTitle);
    }

    @Override
    public String toString() {
        return "StudentWorker [" + "jobTitle=" + jobTitle + ']';
    }
}

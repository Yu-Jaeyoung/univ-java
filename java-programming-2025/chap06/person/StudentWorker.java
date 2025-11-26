package chap06.person;

public class StudentWorker extends Student {
    private String company;
    private String title;
    private int salary;

    public StudentWorker(String name, String department, String studentId, double grade, String company, String title, int salary) {
        super(name, department, studentId, grade);
        this.company = company;
        this.title = title;
        this.salary = salary;
    }

//    public void printStudentWorker() {
//        this.printStudent();
//        System.out.println("회사: " + company);
//        System.out.println("직급: " + title);
//        System.out.println("연봉: " + salary);
//    }

    @Override
    public void print() {
        super.print();
        System.out.println("회사: " + company);
        System.out.println("직급: " + title);
        System.out.println("연봉: " + salary);
    }

    @Override
    public String toString() {
        return "회사: " + company + "\n" +
                "직급: " + title + "\n" +
                "연봉: " + salary + "\n";
    }
}

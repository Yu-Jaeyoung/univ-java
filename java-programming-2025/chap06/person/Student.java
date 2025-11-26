package chap06.person;

public class Student extends Person {
    private final String department;
    private final String studentId;
    private double grade;

    public Student(String name, String department, String studentId, double grade) {
        super(name);
        this.department = department;
        this.studentId = studentId;
        this.grade = grade;
    }

//    public void printStudent() {
//        this.printPerson();
//        System.out.println("학과: " + department);
//        System.out.println("학번: " + studentId);
//        System.out.println("성적: " + grade);
//    }

    @Override
    public void print() {
        super.print();
        System.out.println("학과: " + department);
        System.out.println("학번: " + studentId);
        System.out.println("성적: " + grade);
    }

    @Override
    public String toString() {
        return "학과: " + department + "\n" +
                "학번: " + studentId + "\n" +
                "성적: " + grade + "\n";
    }
}

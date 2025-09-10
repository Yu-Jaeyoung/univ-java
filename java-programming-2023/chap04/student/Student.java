package chap04.student;

public class Student {
    private String studentNumber;
    private String department;
    private String name;
    private String phoneNumber;


    public Student(String studentNumber, String department, String name, String phoneNumber) {
        this.studentNumber = studentNumber;
        this.department = department;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    void print() {
        System.out.println("학번 : " + this.studentNumber);
        System.out.println("학과 : " + this.department);
        System.out.println("이름 : " + this.name);
        System.out.println("전화번호 : " + this.phoneNumber + "\n");
    }
}

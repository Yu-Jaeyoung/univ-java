package src.chap04.student;

public class StudentMain {

    public static void main(String[] args) {

        Student student_Yu = new Student(
                "20188888",
                "정보통신공학과",
                "유유유",
                "010-1234-5678"
        );
        student_Yu.print();

        Student student_Kim = new Student(
                "20221111",
                "모바일융합공학과",
                "김김김",
                "010-9876-5432"
        );
        student_Kim.print();
    }
}

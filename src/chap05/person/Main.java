package src.chap05.person;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("유재영", "20180000", "정보통신공학과", 4.5);
        // student.print2();

        StudentWorker studentWorker = new StudentWorker("유재영", "20180000", "정보통신공학과", 4.5, "CTO");
        // studentWorker.print3();

        Person person2 = new Person("1234", "홍길동");

        Person person; // 참조변수(레퍼런스)

//        person = person2;
//        // person.print();
//
//        person = student; // 서브 클래스의 레퍼런스를 슈퍼 클래스 레퍼런스에 대입한다. // 업케스팅
//
//        person = studentWorker;
//        // person.print();

        Person person3 = new Student("유재영", "20180000", "정보통신공학과", 4.5);

        // 다운캐스팅
        //((Student) person3).print2();

        //((Student) person2).print2();

//        boolean r1 = person2 instanceof Person;
//        boolean r2 = person2 instanceof Student;
//
//        System.out.println(r1);
//        System.out.println(r2);
//
//        boolean r3 = person3 instanceof Person;
//        boolean r4 = person3 instanceof Student;
//        System.out.println(r3);
//        System.out.println(r4);
//
//        if (person3 instanceof Student) {
//            ((Student) person3).print2();
//        } else {
//            person3.print();
//        }
//
//        if (person2 instanceof Student) {
//            ((Student) person2).print2();
//        } else {
//            person2.print();
//        }

        // 메소드 오버라이딩(overriding)
        person = person2; // person2 -> Person 객체
        // person.print();
        System.out.println(person);

        System.out.println("--------------------------");

        person = student; // student -> Student 객체
        // person.print();
        System.out.println(person);

        System.out.println("--------------------------");

        person = studentWorker; // studentWorker -> StudentWorker 객체
        // person.print();
        System.out.println(person);

        // 아래 두 문장은 같은 것 (묵시적으로 toString()이 실행됨)
        // System.out.println(person);
        // System.out.println(person.toString());
    }
}

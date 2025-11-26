package chap06.person;

public class Main {
    public static void main(String[] args) {

        // Up Casting
        Person person1 = new Person("김자바");
        Person person2 = new Student("이자바", "모바일융합공학과", "20251126", 4.5);
        Person person3 = new StudentWorker("박자바", "모바일융합공학과", "20251126", 4.5, "WiSoft", "사원", 70000000);

        // Down Casting
        //    person1.printPerson();
        //    ((Student) person2).printStudent();
        //    ((StudentWorker) person3).printStudentWorker();
        //
        //    if (person1 instanceof Person) {
        //        ((Student) person1).printStudent();
        //    } else {
        //        person1.printPerson();
        //    }
        //
        //    if (person2 instanceof Student) {
        //        ((Student) person2).printStudent();
        //    } else {
        //        person2.printPerson();
        //    }
        //
        //    if (person3 instanceof StudentWorker) {
        //        ((StudentWorker) person3).printStudentWorker();
        //    } else {
        //        person3.printPerson();
        //    }

        person1.print();
        System.out.println("-----------------------------------------------");
        person2.print();
        System.out.println("-----------------------------------------------");
        person3.print();
    }
}

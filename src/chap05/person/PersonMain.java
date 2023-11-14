package src.chap05.person;

public class PersonMain {
    public static void main(String[] args) {

        Person[] persons = new Person[4];
        persons[0] = new Person("김길동", "20180000");
        persons[1] = new Student("박길동", "20181111", "정보통신공학과", 4.0);
        persons[2] = new StudentWorker("이길동", "20182222", "모바일융합공학과", 4.4, "CTO");
        persons[3] = new Student("최길동", "20183333", "정보통신공학과", 4.3);

        for (Person person : persons) {
            person.print();
            System.out.println("=====================");
        }
    }
}

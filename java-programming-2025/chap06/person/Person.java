package chap06.person;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

//    public void printPerson() {
//        System.out.println("이름: " + name);
//    }

    public void print() {
        System.out.println("이름: " + name);
    }

    @Override
    public String toString() {
        return "이름" + name;
    }
}

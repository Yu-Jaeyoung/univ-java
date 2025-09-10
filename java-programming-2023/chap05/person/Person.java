package chap05.person;

public class Person extends Object {
    private String name;
    private String id;

    public Person(final String name, final String id) {
        this.id = id;
        this.name = name;
    }

    public void print() {
        System.out.println(id);
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Person [" + "name=" + name + ", id=" + id + ']';
    }
}

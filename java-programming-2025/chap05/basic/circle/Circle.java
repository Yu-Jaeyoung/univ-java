package chap05.basic.circle;

public class Circle {

    // field, member variable
    int radius;
    String name;

    // constructor
    public Circle(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public Circle(int radius) {
        this.radius = radius;
        this.name = "기본";
    }

    public Circle(String name) {
        this.radius = 10;
        this.name = name;
    }

    // method, member function
    double getArea() {
        return 3.14 * radius * radius;
    }
}

package chap04.circle;

public class Circle {
    // 멤버 변수, 속성
    int radius;
    String name;

    // 멤버 함수, 메소드
    double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    // default constructor
    // public Circle() {

    // }

    // 메소드 오버로딩 - method overloading
    public Circle() {
        this.radius = 1;
        this.name = "no name";
    }

    public Circle(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public Circle(int radius) {
        this.radius = radius;
        this.name = "no name";
    }
}

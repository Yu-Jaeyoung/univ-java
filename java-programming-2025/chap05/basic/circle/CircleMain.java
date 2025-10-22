package chap05.basic.circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle pizza;

        // Circle Object (Create instance)
        pizza = new Circle(10, "Java Pizza");

        // pizza.radius = 10;
        // pizza.name = "Java Pizza";

        double area = pizza.getArea();

        System.out.println(pizza.name + "의 면적은 " + area + " 입니다.");
    }
}

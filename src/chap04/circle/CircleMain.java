package src.chap04.circle;

public class CircleMain {
    public static void main(String[] args) {

        Circle pizza; // 객체 참조 변수
        pizza = new Circle(); // 객체 생성

        pizza.name = "자바피자";
        pizza.radius = 10;

        double area = pizza.getArea(); // 메소드 사용, 호출
        System.out.println(area);

        Circle donut = new Circle();

        donut.radius = 2;
        donut.name = "자바도넛";

        System.out.println(donut.getArea());

        Circle egg = new Circle(2, "계란");
        System.out.println(egg.getArea());
    }
}

package chap04.circle;

public class CircleArray {
    public static void main(String[] args) {

        // 1. 배열 레퍼런스 변수 선언
        Circle[] circles;

        // 2. 배열 생성
        circles = new Circle[5];

        // 1,2를 같이 쓴다면,
        Circle[] circles2 = new Circle[10];

        // 3. 배열의 각 원소 객체 생성
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 2, "circle " + i);
        }

        // 4. 객체 배열 원소 출력하기
        for (Circle circle : circles) {
            System.out.println("radius = " + circle.radius);
            System.out.println("name = " + circle.name);
            System.out.println("area = " + circle.getArea());
        }

        // 5. 각 원소 객체 생성하지 않은 경우
        for (int i = 0; i < circles2.length; i++) {
            System.out.println(circles2[i].name);
        }
    }
}

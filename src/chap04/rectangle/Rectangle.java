package src.chap04.rectangle;

public class Rectangle {
    int width;
    int height;

    int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 4;
        rectangle.height = 5;

        System.out.println("사각형의 면적은 " + rectangle.getArea());

    }
}



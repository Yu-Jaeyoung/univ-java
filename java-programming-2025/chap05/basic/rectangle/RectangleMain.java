package chap05.basic.rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle phone = new Rectangle();

        phone.name = "IPhone 14 Pro";
        phone.width = 0.715;
        phone.height = 1.475;

        System.out.println(phone.name + "의 면적은 " + phone.getArea() + " 입니다.");

    }
}

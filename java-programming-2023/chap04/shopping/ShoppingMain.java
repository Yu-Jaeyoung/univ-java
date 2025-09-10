package chap04.shopping;

public class ShoppingMain {
    public static void main(String[] args) {
        Customer customer = new Customer("gildong", "홍길동",
                "gildong@hanbat.ac.kr", "대전시 유성구 덕명동", 0);
        Customer customer1 = new Customer("jaeyoung", "유재영",
                "jaeyoung@hanbat.ac.kr", "세종시", 0);

        customer.print();
        customer.setMileage(10000);
        customer.print();

    }
}

package chap04.shopping;

public class Customer {
    private String id;
    private String name;
    private String email;
    private String address;
    private int mileage;

    public Customer(String id, String name, String email, String address, int mileage) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.mileage = mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void print() {
        System.out.println("아이디: " + id);
        System.out.println("이름: " + name);
        System.out.println("이메일: " + email);
        System.out.println("주소: " + address);
        System.out.println("마일리지: " + mileage + "\n");
    }
}

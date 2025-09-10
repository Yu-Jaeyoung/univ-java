package chap07.interfaceex;

public class CarMain {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tires[0] = new HankookTire();
        myCar.tires[1] = new HankookTire();
        myCar.tires[2] = new HankookTire();
        myCar.tires[3] = new HankookTire();

        myCar.run();

        myCar.tires[0] = new KumhoTire();
        myCar.tires[1] = new KumhoTire();
        myCar.tires[2] = new KumhoTire();
        myCar.tires[3] = new KumhoTire();

        myCar.run();

        myCar.tires[0] = new HankookTire();
        myCar.tires[1] = new HankookTire();
        myCar.tires[2] = new KumhoTire();
        myCar.tires[3] = new KumhoTire();

        myCar.run();
    }
}

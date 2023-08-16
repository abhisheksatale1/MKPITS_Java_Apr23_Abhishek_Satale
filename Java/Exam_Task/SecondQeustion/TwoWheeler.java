package SecondQeustion;

public class TwoWheeler extends Car implements MotorBike, Cycle {
    @Override
    public void speed() {
        System.out.println("Speed of MotorBike");
    }

    @Override
    public void distance() {
        System.out.println("Distance of Cycle");
    }

    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.speed();
        twoWheeler.distance();
//twoWheeler.display();
    }
}

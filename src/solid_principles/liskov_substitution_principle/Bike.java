package solid_principles.liskov_substitution_principle;

public class Bike implements TwoWheeler{
    boolean turnOn = false;
    int speed = 0;
    @Override
    public void turnOnEngine() {
        turnOn = true;
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating bike");
        speed +=10;
    }
}

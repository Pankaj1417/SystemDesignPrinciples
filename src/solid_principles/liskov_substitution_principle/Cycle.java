package solid_principles.liskov_substitution_principle;

public class Cycle implements TwoWheeler{
    int speed = 0;
    @Override
    public void turnOnEngine() {
        throw new AssertionError("I do not have any engine");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating cycle");
        speed+=2;
    }
}

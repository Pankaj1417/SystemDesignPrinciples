package systemDesign.CreationalPatterns.FactoryPattern.Product;

public class Bus implements Vehicle{
    protected String name = "Bus";

    @Override
    public String getName() {
        return "Bus";
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }
}

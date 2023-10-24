package systemDesign.CreationalPatterns.FactoryPattern.Product;

public class Bike implements Vehicle{
    @Override
    public String getName() {
        return "Bike";
    }

    @Override
    public void drive() {
        System.out.println("Bike is driving");
    }
}

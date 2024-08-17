package systemDesign.CreationalPatterns.FactoryPattern.Product;

public class Car implements Vehicle{

    @Override
    public String getName() {
        return "Car";
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

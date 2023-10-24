package systemDesign.CreationalPatterns.FactoryPattern.Product;

import com.sun.xml.internal.stream.StaxErrorReporter;

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

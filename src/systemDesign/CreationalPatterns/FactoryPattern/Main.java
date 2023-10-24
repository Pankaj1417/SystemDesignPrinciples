package systemDesign.CreationalPatterns.FactoryPattern;

import systemDesign.CreationalPatterns.FactoryPattern.Creator.BalancedVehicleFactory;
import systemDesign.CreationalPatterns.FactoryPattern.Creator.RandomVehicleFactory;
import systemDesign.CreationalPatterns.FactoryPattern.Product.Vehicle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BalancedVehicleFactory vehicleFactory = new BalancedVehicleFactory();
            Vehicle vehicle = vehicleFactory.createVehicle();
            vehicle.drive();
    }
}

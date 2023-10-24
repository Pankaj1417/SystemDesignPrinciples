package systemDesign.CreationalPatterns.FactoryPattern.Creator;

import systemDesign.CreationalPatterns.FactoryPattern.Product.Bike;
import systemDesign.CreationalPatterns.FactoryPattern.Product.Bus;
import systemDesign.CreationalPatterns.FactoryPattern.Product.Car;
import systemDesign.CreationalPatterns.FactoryPattern.Product.Vehicle;

import java.util.Random;

public class VehicleFactoryHelper {

    private static Class<? extends Vehicle>[] vehicleTypes ;
    public VehicleFactoryHelper(){
        vehicleTypes =  new Class[] {Car.class, Bus.class, Bike.class};
    }

     Vehicle getRandomVehicle(){
        Random random = new Random();
        int randomIndex = random.nextInt(vehicleTypes.length);
        try {
            return vehicleTypes[randomIndex].newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}

package systemDesign.CreationalPatterns.FactoryPattern.Creator;

import systemDesign.CreationalPatterns.FactoryPattern.Product.Bike;
import systemDesign.CreationalPatterns.FactoryPattern.Product.Bus;
import systemDesign.CreationalPatterns.FactoryPattern.Product.Car;
import systemDesign.CreationalPatterns.FactoryPattern.Product.Vehicle;

import java.util.Random;

//public class RandomVehicleFactory implements VehicleFactory{
//    String[] vehicleArray = {"Car","Bus","Bike"};
//
//    @Override
//     public Vehicle createVehicle() {
//        Random random = new Random();
//        int randomInteger = random.nextInt(3);
//        String vehicle = vehicleArray[randomInteger];
//        switch (vehicle){
//            case "Car" :
//                return new Car();
//            case "Bus" :
//                return new Bus();
//            case "Bike" :
//                return new Bike();
//            default:
//                return null;
//        }
//    }

public class RandomVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        VehicleFactoryHelper factoryHelper = new VehicleFactoryHelper();
       return factoryHelper.getRandomVehicle();
    }
}

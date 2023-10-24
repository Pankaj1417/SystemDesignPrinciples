package systemDesign.CreationalPatterns.FactoryPattern.Creator;

import systemDesign.CreationalPatterns.FactoryPattern.Product.Bike;
import systemDesign.CreationalPatterns.FactoryPattern.Product.Bus;
import systemDesign.CreationalPatterns.FactoryPattern.Product.Car;
import systemDesign.CreationalPatterns.FactoryPattern.Product.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class BalancedVehicleFactory implements VehicleFactory{
   private Map<String,Integer> vehiclesCount;
    private final Class<? extends Vehicle>[] vehicles;
    public BalancedVehicleFactory(){
        vehicles = new Class[]{Bike.class, Bus.class, Car.class};
        vehiclesCount = new HashMap<>();
        vehiclesCount.put("Bike",0);
        vehiclesCount.put("Bus",0);
        vehiclesCount.put("Car",0);
    }
    @Override
    public Vehicle createVehicle() {
        if(isCountSame()){
            VehicleFactoryHelper factoryHelper = new VehicleFactoryHelper();
            Vehicle vehicle =  factoryHelper.getRandomVehicle();
            final String vehicleName = vehicle.getName();
            vehiclesCount.put(vehicleName,vehiclesCount.get(vehicleName)+1);
            return vehicle;
        }
        //Implement rest of the cases
        //Two are same ---- 3rd can be big or small.


        return null;
    }
    private boolean isCountSame(){
        return vehiclesCount.get("Bike").equals(vehiclesCount.get("Bus"))
                && vehiclesCount.get("Bike").equals(vehiclesCount.get("Car"));
    }
}

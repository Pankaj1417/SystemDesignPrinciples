package systemDesign.CreationalPatterns.FactoryPattern.Creator;

import systemDesign.CreationalPatterns.FactoryPattern.Product.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle();
}

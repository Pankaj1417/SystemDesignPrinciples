package design_patterns.creational.factory;

import design_patterns.creational.factory.model.Employee;

public class EmployeeFactory {
    public static <T extends Employee> T get(Class<T> employee){
        try{
            return employee.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
            throw new IllegalArgumentException("Please provide a valid class name");
        }
    }
}

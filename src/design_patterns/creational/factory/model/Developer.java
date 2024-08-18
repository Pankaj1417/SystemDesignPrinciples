package design_patterns.creational.factory.model;

public class Developer implements Employee {
    @Override
    public double getSalary() {
        System.out.println("Current employee is developer");
        return 100000;
    }
}

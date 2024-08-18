package design_patterns.creational.factory.model;

public class Accountant implements Employee {
    @Override
    public double getSalary() {
        System.out.println("Current employee is accountant");
        return 50000;

    }
}

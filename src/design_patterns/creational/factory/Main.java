package design_patterns.creational.factory;

import design_patterns.creational.factory.model.Accountant;
import design_patterns.creational.factory.model.Developer;
import design_patterns.creational.factory.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee developer = EmployeeFactory.get(Developer.class);
        Employee accountant = EmployeeFactory.get(Accountant.class);
        System.out.println( developer.getSalary());
        System.out.println(accountant.getSalary());
    }
}

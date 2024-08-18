package design_patterns.creational.abstractFactory.uiComponents;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("Mac button is clicked");
    }
}

package design_patterns.creational.abstractFactory.uiComponents;
public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("windows button is clicked");
    }
}

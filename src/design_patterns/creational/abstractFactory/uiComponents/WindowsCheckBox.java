package design_patterns.creational.abstractFactory.uiComponents;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void click() {
        System.out.println("windows checkbox is clicked");
    }
}

package design_patterns.creational.abstractFactory.uiComponents;

public class MacCheckBox implements CheckBox{
    @Override
    public void click() {
        System.out.println("Mac checkbox is clicked");
    }
}

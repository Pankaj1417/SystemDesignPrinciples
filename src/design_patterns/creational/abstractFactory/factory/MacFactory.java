package design_patterns.creational.abstractFactory.factory;

import design_patterns.creational.abstractFactory.uiComponents.Button;
import design_patterns.creational.abstractFactory.uiComponents.CheckBox;
import design_patterns.creational.abstractFactory.uiComponents.MacButton;
import design_patterns.creational.abstractFactory.uiComponents.MacCheckBox;

public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}

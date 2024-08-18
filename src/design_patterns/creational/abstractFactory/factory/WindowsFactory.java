package design_patterns.creational.abstractFactory.factory;

import design_patterns.creational.abstractFactory.uiComponents.Button;
import design_patterns.creational.abstractFactory.uiComponents.CheckBox;
import design_patterns.creational.abstractFactory.uiComponents.WindowsButton;
import design_patterns.creational.abstractFactory.uiComponents.WindowsCheckBox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }
}

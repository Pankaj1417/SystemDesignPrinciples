package design_patterns.creational.abstractFactory.factory;

import design_patterns.creational.abstractFactory.uiComponents.Button;
import design_patterns.creational.abstractFactory.uiComponents.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}

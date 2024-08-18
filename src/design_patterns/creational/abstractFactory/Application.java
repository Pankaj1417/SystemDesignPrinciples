package design_patterns.creational.abstractFactory;

import design_patterns.creational.abstractFactory.factory.GUIFactory;
import design_patterns.creational.abstractFactory.uiComponents.Button;
import design_patterns.creational.abstractFactory.uiComponents.CheckBox;

public class Application {
    private Button button;
    private CheckBox checkBox;
    public Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckbox();
    }
    public void render(){
        button.click();
        checkBox.click();
    }
}

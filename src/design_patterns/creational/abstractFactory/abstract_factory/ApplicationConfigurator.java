package design_patterns.creational.abstractFactory.abstract_factory;

import design_patterns.creational.abstractFactory.Application;
import design_patterns.creational.abstractFactory.factory.GUIFactory;
import design_patterns.creational.abstractFactory.factory.MacFactory;
import design_patterns.creational.abstractFactory.factory.WindowsFactory;

public class ApplicationConfigurator {
    private Application application;
    private GUIFactory factory;
    public ApplicationConfigurator(){
        this.factory = getGUIFactory();
        application = new Application(this.factory);
    }
    private GUIFactory getGUIFactory(){
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("win")){
            return new WindowsFactory();
        }else if(osName.contains("mac")){
            return new MacFactory();
        }else {
            throw new UnsupportedOperationException("UnSupported OS "+osName);
        }
    }
    public Application getApplication(){
        return application;
    }
}

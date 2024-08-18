package design_patterns.creational.abstractFactory;

import design_patterns.creational.abstractFactory.abstract_factory.ApplicationConfigurator;

public class Main {
    public static void main(String[] args) {
        ApplicationConfigurator applicationConfigurator = new ApplicationConfigurator();
        Application app = applicationConfigurator.getApplication();
        app.render();
    }
}

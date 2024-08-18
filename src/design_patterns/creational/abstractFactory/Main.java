package design_patterns.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        ApplicationConfigurator applicationConfigurator = new ApplicationConfigurator();
        Application app = applicationConfigurator.getApplication();
        app.render();
    }
}

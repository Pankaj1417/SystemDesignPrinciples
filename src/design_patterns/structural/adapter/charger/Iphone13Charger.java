package design_patterns.structural.adapter.charger;

public class Iphone13Charger implements AppleCharger{
    @Override
    public void charge() {
        System.out.println("Apple charger is charging");
    }
}

package design_patterns.structural.adapter.charger;

public class IQOO9Charger implements AndroidCharger{
    @Override
    public void charge() {
        System.out.println("Android charger is charging");
    }
}

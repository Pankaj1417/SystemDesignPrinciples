package design_patterns.structural.adapter.mobile;

import design_patterns.structural.adapter.charger.AppleCharger;

public class Iphone13 implements ApplePhone
{
    private AppleCharger appleCharger;
    public Iphone13(AppleCharger appleCharger){
        this.appleCharger = appleCharger;
    }

    @Override
    public void charge() {
        System.out.println("Charge Iphone 13");
        appleCharger.charge();
    }
}

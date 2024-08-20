package design_patterns.structural.adapter;

import design_patterns.structural.adapter.charger.AndroidCharger;
import design_patterns.structural.adapter.charger.AppleCharger;
import design_patterns.structural.adapter.charger.Iphone13Charger;

public class IphoneAdapter implements AppleCharger {
    private AndroidCharger androidCharger;
    public IphoneAdapter(AndroidCharger androidCharger){
        this.androidCharger = androidCharger;
    }
    @Override
    public void charge() {
        System.out.println("Using adapter to chage iphone");
        androidCharger.charge();
    }
}

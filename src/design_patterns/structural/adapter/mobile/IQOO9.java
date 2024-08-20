package design_patterns.structural.adapter.mobile;

import design_patterns.structural.adapter.charger.AndroidCharger;

public class IQOO9 implements AndroidPhone {
    private AndroidCharger androidCharger;
    public IQOO9(AndroidCharger androidCharger){
        this.androidCharger = androidCharger;
    }
    @Override
    public void charge() {
        System.out.println("Charge IQOO 9");
        androidCharger.charge();
    }
}

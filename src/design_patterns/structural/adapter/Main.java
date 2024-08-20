package design_patterns.structural.adapter;

import design_patterns.structural.adapter.charger.AndroidCharger;
import design_patterns.structural.adapter.charger.IQOO9Charger;
import design_patterns.structural.adapter.mobile.ApplePhone;
import design_patterns.structural.adapter.mobile.Iphone13;

public class Main {
    public static void main(String[] args) {
        AndroidCharger androidCharger = new IQOO9Charger();
        IphoneAdapter iphoneAdapter = new IphoneAdapter(androidCharger);
        ApplePhone iphone13 = new Iphone13(iphoneAdapter);
        iphone13.charge();
    }
}

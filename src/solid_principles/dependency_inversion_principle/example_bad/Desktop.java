package solid_principles.dependency_inversion_principle.example_bad;

import solid_principles.dependency_inversion_principle.Keyboard;
import solid_principles.dependency_inversion_principle.Mouse;
import solid_principles.dependency_inversion_principle.WiredKeyboard;
import solid_principles.dependency_inversion_principle.WirelessMouse;

public class Desktop {
    private Mouse mouse;
    private Keyboard keyboard;
    public Desktop(){
        this.mouse = new WirelessMouse();
        this.keyboard = new WiredKeyboard();
    }

}

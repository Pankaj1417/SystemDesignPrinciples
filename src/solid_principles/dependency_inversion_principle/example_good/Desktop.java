package solid_principles.dependency_inversion_principle.example_good;

import solid_principles.dependency_inversion_principle.Keyboard;
import solid_principles.dependency_inversion_principle.Mouse;

public class Desktop {
    private Mouse mouse;
    private Keyboard keyboard;
    public Desktop(Mouse mouse, Keyboard keyboard){
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
}

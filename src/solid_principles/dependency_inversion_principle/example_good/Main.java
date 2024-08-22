package solid_principles.dependency_inversion_principle.example_good;

import solid_principles.dependency_inversion_principle.Keyboard;
import solid_principles.dependency_inversion_principle.Mouse;
import solid_principles.dependency_inversion_principle.WiredKeyboard;
import solid_principles.dependency_inversion_principle.WirelessMouse;

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new WirelessMouse();
        Keyboard keyboard = new WiredKeyboard();
        Desktop desktop = new Desktop(mouse, keyboard);
    }
}

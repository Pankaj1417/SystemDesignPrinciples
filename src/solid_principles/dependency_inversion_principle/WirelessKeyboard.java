package solid_principles.dependency_inversion_principle;

import java.security.Key;

public class WirelessKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("wireless keyboard is typing");
    }
}

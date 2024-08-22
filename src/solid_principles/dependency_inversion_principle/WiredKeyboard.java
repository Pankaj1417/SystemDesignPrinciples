package solid_principles.dependency_inversion_principle;

public class WiredKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("Wired keybopard is typing");
    }
}

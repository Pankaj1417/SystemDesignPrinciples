package solid_principles.dependency_inversion_principle;

public class WirelessMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Wireless mouse is clicking");
    }
}

package solid_principles.dependency_inversion_principle;

public class WiredMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Wired mouse is clicking");
    }
}

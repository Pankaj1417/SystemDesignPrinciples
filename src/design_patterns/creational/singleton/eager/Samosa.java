package design_patterns.creational.singleton.eager;

public class Samosa {

    // Eager way of initialization
    private static Samosa samosa = new Samosa();
    private Samosa(){
        // private constructor to restrict object creation
    }
    public static Samosa getInstance(){
        return samosa;
    }
}

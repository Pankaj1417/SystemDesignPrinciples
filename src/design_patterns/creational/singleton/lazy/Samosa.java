package design_patterns.creational.singleton.lazy;

public class Samosa
{
    private static Samosa samosa;
    private Samosa(){
        // private constructor to restrict object creation
    }
    public static Samosa getInstance(){
        if(samosa == null){
            samosa = new Samosa();
        }
        return samosa;
    }
}

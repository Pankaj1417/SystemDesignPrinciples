package design_patterns.creational.singleton;

import design_patterns.creational.singleton.lazy.Samosa;

public class Main{
    public static void main(String[] args) {
        Samosa samosa1 = Samosa.getInstance();
        Samosa samosa2 = Samosa.getInstance();
        System.out.println(samosa2.hashCode() == samosa1.hashCode());
    }
}

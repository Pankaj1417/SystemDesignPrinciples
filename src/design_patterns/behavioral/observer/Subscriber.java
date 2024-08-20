package design_patterns.behavioral.observer;

public class Subscriber implements Observer{
    final String name;
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void notified() {
        System.out.println("Hii "+name+" You are being notified");
    }
}

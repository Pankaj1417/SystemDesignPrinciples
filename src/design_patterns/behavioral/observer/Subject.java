package design_patterns.behavioral.observer;

public interface Subject {
    void subscribe(Observer ob);
    void unSubscribe(Observer ob);
    void notifyAllObservers();
}

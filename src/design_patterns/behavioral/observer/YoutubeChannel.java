package design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    List<Observer> subscribersList = new ArrayList<>();
    @Override
    public void subscribe(Observer ob) {
        subscribersList.add(ob);
    }

    @Override
    public void unSubscribe(Observer ob) {
        subscribersList.remove(ob);
    }

    @Override
    public void notifyAllObservers() {
        subscribersList.forEach(Observer::notified);
    }
}

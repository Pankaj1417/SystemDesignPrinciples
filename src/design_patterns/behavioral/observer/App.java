package design_patterns.behavioral.observer;

public class App {
    public static void main(String[] args) {
        Subject youtubeChannel = new YoutubeChannel();
        Observer observer = new Subscriber("Pankaj");
        Observer observer1 = new Subscriber("Kajal");
        youtubeChannel.subscribe(observer1);
        youtubeChannel.subscribe(observer);

        youtubeChannel.notifyAllObservers();
    }
}

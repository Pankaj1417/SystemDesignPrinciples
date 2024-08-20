package design_patterns.behavioral.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        Subject youtubeChannel = new YoutubeChannel();
        Observer observer = new Subscriber("Pankaj");
        Observer observer1 = new Subscriber("Kajal");
        youtubeChannel.subscribe(observer1);
        youtubeChannel.subscribe(observer);

        youtubeChannel.notifyAllObservers();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        while (true){
//            int x = Integer.parseInt(bufferedReader.readLine());
//            if(x == 1){
//
//            }else if(x == 2){
//
//            }else if(x == 3){
//
//            }else{
//
//            }
//        }
    }
}

import java.util.ArrayList;

public class Pub implements Subject {
    private ArrayList<Observer> observers;
    private String name;
    private String address;
    private String discount;
    private String event;

    public Pub() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer =  observers.get(i);
            observer.update(name, address, discount, event);
        }
    }

    public void setStatus(String name, String address, String discount, String event) {
        this.name = name;
        this.address = address;
        this.discount = discount;
        this.event = event;
        notifyObservers();
    }
}
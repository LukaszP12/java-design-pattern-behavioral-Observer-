package ChainOfResponsibilityVsObserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class SupportTicketSystem {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer o) { observers.add(o); }

    public void notifyObservers(String issue) {
        for (Observer o : observers) o.update(issue);
    }
}

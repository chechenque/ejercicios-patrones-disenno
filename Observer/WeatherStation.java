import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperatura;

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperatura);
        }
    }
}

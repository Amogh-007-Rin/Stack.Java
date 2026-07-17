import java.util.ArrayList;
import java.util.List;

interface WeatherObserver {
    void update(float temperature, float humidity, float pressure);
}

class WeatherStation {

    private final List<WeatherObserver> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}

class CurrentConditionsDisplay implements WeatherObserver {

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current conditions: " + temperature
                + "C, " + humidity + "% humidity");
    }
}

class StatisticsDisplay implements WeatherObserver {

    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float sumTemp;
    private int readings;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        sumTemp += temperature;
        readings++;
        maxTemp = Math.max(maxTemp, temperature);
        minTemp = Math.min(minTemp, temperature);
        System.out.println("Avg/Max/Min temperature: "
                + (sumTemp / readings) + "/" + maxTemp + "/" + minTemp);
    }
}

public class ObserverPattern {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        CurrentConditionsDisplay current = new CurrentConditionsDisplay();
        StatisticsDisplay stats = new StatisticsDisplay();

        station.addObserver(current);
        station.addObserver(stats);

        station.setMeasurements(25.0f, 65.0f, 1013.0f);
        station.setMeasurements(27.5f, 70.0f, 1012.0f);
        station.setMeasurements(23.0f, 80.0f, 1015.0f);

        station.removeObserver(stats);
        station.setMeasurements(26.0f, 60.0f, 1014.0f);
    }
}

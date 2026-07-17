import java.util.ArrayList;
import java.util.List;

interface StockObserver {
    void update(String symbol, double oldPrice, double newPrice);
}

class Stock {

    private final String symbol;
    private double price;
    private final List<StockObserver> observers = new ArrayList<>();

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setPrice(double newPrice) {
        double oldPrice = this.price;
        this.price = newPrice;
        notifyObservers(oldPrice, newPrice);
    }

    private void notifyObservers(double oldPrice, double newPrice) {
        for (StockObserver observer : observers) {
            observer.update(symbol, oldPrice, newPrice);
        }
    }
}

class PriceDisplay implements StockObserver {

    @Override
    public void update(String symbol, double oldPrice, double newPrice) {
        System.out.println(symbol + " price changed: $" + oldPrice + " -> $" + newPrice);
    }
}

class AlertSystem implements StockObserver {

    @Override
    public void update(String symbol, double oldPrice, double newPrice) {
        double change = Math.abs((newPrice - oldPrice) / oldPrice) * 100;
        if (change > 5.0) {
            System.out.println("ALERT: " + symbol + " changed by "
                    + String.format("%.2f", change) + "%!");
        }
    }
}

public class StockObserverDemo {

    public static void main(String[] args) {
        Stock apple = new Stock("AAPL", 150.0);

        apple.addObserver(new PriceDisplay());
        apple.addObserver(new AlertSystem());

        apple.setPrice(152.0);
        apple.setPrice(155.0);
        apple.setPrice(165.0);
        apple.setPrice(140.0);
    }
}

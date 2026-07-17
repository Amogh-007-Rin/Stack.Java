import java.util.Observable;
import java.util.Observer;

class NewsAgency extends Observable {

    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}

class NewsChannel implements Observer {

    private final String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " received news: " + arg);
    }
}

public class LegacyObserverExample {

    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        NewsChannel cnn = new NewsChannel("CNN");
        NewsChannel bbc = new NewsChannel("BBC");

        agency.addObserver(cnn);
        agency.addObserver(bbc);

        agency.setNews("Java 21 released!");
        agency.setNews("New record: 100 days without a null pointer!");
    }
}

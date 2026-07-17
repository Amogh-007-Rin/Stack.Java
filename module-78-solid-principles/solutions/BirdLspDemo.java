import java.util.ArrayList;
import java.util.List;

interface Flyable {
    void fly();
}

abstract class Bird {
    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void move();
}

class Sparrow extends Bird implements Flyable {

    public Sparrow() {
        super("Sparrow");
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}

class Penguin extends Bird {

    public Penguin() {
        super("Penguin");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is swimming");
    }
}

class Eagle extends Bird implements Flyable {

    public Eagle() {
        super("Eagle");
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is soaring high");
    }
}

public class BirdLspDemo {

    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Sparrow());
        birds.add(new Penguin());
        birds.add(new Eagle());

        for (Bird bird : birds) {
            System.out.print(bird.getName() + ": ");
            bird.move();
        }
    }
}

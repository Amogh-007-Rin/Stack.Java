interface Pizza {
    String getDescription();
    double getCost();
}

class BasePizza implements Pizza {

    @Override
    public String getDescription() {
        return "Base Pizza";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}

abstract class PizzaDecorator implements Pizza {

    protected final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}

class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}

class PepperoniDecorator extends PizzaDecorator {

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}

class OliveDecorator extends PizzaDecorator {

    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.0;
    }
}

public class PizzaDecoratorDemo {

    public static void main(String[] args) {
        Pizza margherita = new CheeseDecorator(new BasePizza());
        System.out.println(margherita.getDescription() + " = $" + margherita.getCost());

        Pizza pepperoni = new PepperoniDecorator(new CheeseDecorator(new BasePizza()));
        System.out.println(pepperoni.getDescription() + " = $" + pepperoni.getCost());

        Pizza supreme = new OliveDecorator(
                new PepperoniDecorator(
                        new CheeseDecorator(new BasePizza())));
        System.out.println(supreme.getDescription() + " = $" + supreme.getCost());

        Pizza plain = new BasePizza();
        System.out.println(plain.getDescription() + " = $" + plain.getCost());
    }
}

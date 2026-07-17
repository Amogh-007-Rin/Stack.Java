public class Solution1 {
    public static void main(String[] args) {
        CoffeeMachine cm = new CoffeeMachine();
        cm.turnOn();
        cm.brewEspresso();
        cm.turnOff();
    }
}

class CoffeeMachine {
    private boolean isOn;
    private int waterLevel;
    private int beansLevel;

    public CoffeeMachine() {
        this.isOn = false;
        this.waterLevel = 1000;
        this.beansLevel = 200;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("CoffeeMachine turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("CoffeeMachine turned off");
    }

    public void brewEspresso() {
        if (!isOn) {
            System.out.println("Turn on the machine first");
            return;
        }
        if (waterLevel < 30 || beansLevel < 7) {
            System.out.println("Not enough water or beans");
            return;
        }
        waterLevel -= 30;
        beansLevel -= 7;
        System.out.println("Espresso brewed!");
    }
}

class Computer {
    private String brand;

    public Computer(String brand) {
        this.brand = brand;
    }

    static class Processor {
        private String model;
        private double speedGHz;

        public Processor(String model, double speedGHz) {
            this.model = model;
            this.speedGHz = speedGHz;
        }

        public void display() {
            System.out.println("Processor: " + model + " @ " + speedGHz + " GHz");
        }
    }
}

public class Exercise1Solution {
    public static void main(String[] args) {
        Computer.Processor cpu = new Computer.Processor("Intel Core i7", 3.5);
        cpu.display();
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        System.out.println("Setting temperature to 25...");
        thermostat.setTemperature(25);
        System.out.println("Current temp: " + thermostat.getTemperature());

        try {
            System.out.println("Setting temperature to 50...");
            thermostat.setTemperature(50);
        } catch (TemperatureOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Setting temperature to -5...");
            thermostat.setTemperature(-5);
        } catch (TemperatureOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Thermostat {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temp) {
        if (temp < 0 || temp > 40) {
            throw new TemperatureOutOfRangeException(
                "Temperature " + temp + " is out of range (0-40)"
            );
        }
        this.temperature = temp;
    }
}

class TemperatureOutOfRangeException extends RuntimeException {
    public TemperatureOutOfRangeException(String message) {
        super(message);
    }
}

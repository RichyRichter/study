package Stage1_3.Task3;

public class Fridge extends ElectricalDevice {
    public double volume;

    public Fridge(String name, String model, int power, double volume) {
        super(name, model, power);
        this.volume = volume;
    }
}



package Stage1_3.Task3;

public class Kettle extends ElectricalDevice {
    final public double volume;

    public Kettle(String name, String model, int power, double volume) {
        super(name, model, power);
        this.volume = volume;
    }
}

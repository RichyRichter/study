package Stage1_3.Task3;

public class Heater extends ElectricalDevice {
    public double heatingArea;
    public Heater(String name, String model, int power, double heatingArea) {
        super(name, model, power);
        this.heatingArea = heatingArea;
    }
}

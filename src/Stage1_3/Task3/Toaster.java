package Stage1_3.Task3;

public class Toaster extends ElectricalDevice {
    public int volumeOfToast;

    public Toaster(String name, String model, int power, int volumeOfToast) {
        super(name, model, power);
        this.volumeOfToast = volumeOfToast;
    }

}

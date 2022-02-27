package Stage1_3.Task2;


public class RAM extends StorageDevice {
    private double frequency;

    public RAM(String name, int memoryCapacity, double frequency) {
        super(name, memoryCapacity);
        this.frequency = frequency;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Частота: " + frequency;
    }
}
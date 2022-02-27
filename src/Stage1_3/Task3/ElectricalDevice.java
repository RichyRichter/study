package Stage1_3.Task3;

import java.util.Objects;

public class ElectricalDevice {
    String name;
    String model;
    public int power;


    public int getPower() {
        return this.power;
    }


    public String getFullName() {
        return "Name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public ElectricalDevice(String name, String model, int power) {
        this.name = name;
        this.model = model;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectricalDevice that = (ElectricalDevice) o;
        return power == that.power && Objects.equals(name, that.name) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, power);
    }

}

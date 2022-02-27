package Stage1_3.Task3;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class ElectricalNetwork {
    private double maxPower;
    private double maxLoad;
    private double currentLoad;
    private double currentPower;
    String formattedDouble;
    private Map<ElectricalDevice, Boolean> devices = new HashMap<>();//прибор и его состояние(Вкл/Выкл)

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
        this.maxPower = maxLoad * 220;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public double getCurrentPower() {
        return currentPower;
    }

    public Map<ElectricalDevice, Boolean> getDevices() {
        return devices;
    }

    public void addDevice(ElectricalDevice device) {
        devices.put(device, false);
    }
    public void printDevicesInNetwork() {
        StringBuilder info = new StringBuilder("Приборы в сети:\n");
        for (Map.Entry<ElectricalDevice, Boolean> entry : devices.entrySet()) {
            ElectricalDevice device = entry.getKey();
            info.append(device.name);
            if (entry.getValue()) info.append(" - включен. ");
            else info.append(" - отключен. ");
            info.append("Потребляемая мощность:" + device.power + " Вт.\n");
        }
        formattedDouble  = new DecimalFormat("#0.00").format(currentLoad);
        System.out.println(info.append("Текщая нагрузка сети: " + formattedDouble + " А."));
        if (currentPower > maxPower)
            System.out.printf(checkDevices() + "\n");
    }

    public boolean isLoadLimit(){
        return currentLoad > maxLoad;
    }

    public void turnOnDevice(ElectricalDevice device) {
        if (devices.containsKey(device) && !devices.get(device)) {
            devices.put(device, true);
            currentPower += device.power;
        }
        currentLoad = currentPower/220;
    }

    public void turnOffDevice(ElectricalDevice device) {
        if (devices.containsKey(device) && devices.get(device)) {
            devices.put(device, false);
            currentPower -= device.power;
        }
        currentLoad = currentPower/220;
    }

    public String checkDevices() {
        ElectricalDevice recommended = null;
        ElectricalDevice device;
        int minPower = Integer.MAX_VALUE;
        for (Map.Entry<ElectricalDevice, Boolean> entry : devices.entrySet()) {
            device = entry.getKey();
            if (entry.getValue() && (currentPower - device.power <= maxPower) && device.power < minPower) {
                recommended = device;
                minPower = device.power;
            }
        }
        if (recommended == null) return "Максимальная нагрузка: " + maxLoad + " А.  Отключите несколько приборов.\n";
        else return "Максимальная нагрузка: " + maxLoad
                + " А.  Рекмоендуем отключить: " + recommended.name + "\n";
    }

}






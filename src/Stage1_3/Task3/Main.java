package Stage1_3.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ElectricalNetwork network = new ElectricalNetwork();

        System.out.println("Введите мощность холодильника (Вт):");
        Fridge fridge = new Fridge("Холодильник", "GA-B459CLWL", scanner.nextInt(), 351);
        network.addDevice(fridge);

        System.out.println("Введите мощность обогревателя (Вт):");
        Heater heater = new Heater("Обогреватель", "Neoclima NC 9307", scanner.nextInt(), 15);
        network.addDevice(heater);

        System.out.println("Введите мощность тостера (Вт):");
        Toaster toaster = new Toaster("Тостер", "Philips HD2581", scanner.nextInt(), 2);
        network.addDevice(toaster);

        System.out.println("Введите мощность чайника (Вт):");
        Kettle kettle = new Kettle("Чайник", "DDT-313", scanner.nextInt(), 3);
        network.addDevice(kettle);

        System.out.println("Введите максимальную нагрузки на сеть (А):");
        network.setMaxLoad(scanner.nextDouble());

        network.printDevicesInNetwork();
        for (;;) {
            String name;
            while (network.isLoadLimit()){
                System.out.println("Напишите название прибора для ВЫКЛючения:");
                name = br.readLine();
                for (Map.Entry<ElectricalDevice, Boolean> entry : network.getDevices().entrySet()) {
                    ElectricalDevice device = entry.getKey();
                    if (device.name.equals(name)) network.turnOffDevice(entry.getKey());
                }
                network.printDevicesInNetwork();
            }

            System.out.println("Напишите название прибора для ВКЛючения:");
            name = br.readLine();
            for (Map.Entry<ElectricalDevice, Boolean> entry : network.getDevices().entrySet()) {
                ElectricalDevice device = entry.getKey();
                if (device.name.equals(name)) network.turnOnDevice(entry.getKey());
            }
            network.printDevicesInNetwork();

        }

    }

}


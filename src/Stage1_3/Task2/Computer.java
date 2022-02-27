package Stage1_3.Task2;

import java.util.Random;

public class Computer {
    private boolean activity = false;
    private boolean infection = false;

    Processor intel = new Processor("i5 10600k", 6, 4.1);
    StorageDevice hyper = new RAM("Fury Black", 32, 3200);
    StorageDevice wdBlue = new HardDiskDrive("WD Blue", 1024);
    StorageDevice kingston = new SolidStateDrive("KC2500", 512);

    public void switchActivity() {
        this.activity = !activity;
    }

    public void showConfiguration() {
        StringBuilder info = new StringBuilder();
        info.append(intel.getInfo() + "\n");
        info.append(hyper.getInfo() + "\n");
        info.append(wdBlue.getInfo() + "\n");
        info.append(kingston.getInfo() + "\n");
        System.out.println(info);
    }
    public boolean checkForViruses(){
        Random rd = new Random();
        infection = rd.nextBoolean();
        return infection;
    }
    public void showCheckForViruses(){
        Random rd = new Random();
        System.out.println("Результат проверки на вирусы: " + checkForViruses());
    }

}


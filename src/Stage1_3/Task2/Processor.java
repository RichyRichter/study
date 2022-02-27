package Stage1_3.Task2;

public class Processor {
    private double frequency;
    private double numberOfCores;
    private String name;

    public Processor(String name, double numberOfCores, double frequency) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.name = name;
    }
    public String getInfo(){
        StringBuilder info = new StringBuilder("Информация о процессоре:\n");
        return info.append("Название: " + name +" Кол - во ядер: "+ numberOfCores
                + " Частота: " + frequency).toString();
    }
}

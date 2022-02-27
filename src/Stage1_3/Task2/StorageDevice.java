package Stage1_3.Task2;

public class StorageDevice {
    public int memoryCapacity;
    public String name;
    public StorageDevice(String name, int memoryCapacity){
        this.name = name;
        this.memoryCapacity = memoryCapacity;
    }

    public String getInfo(){
        StringBuilder info = new StringBuilder("Информация о устройстве "+ name + ":\n");
        return info.append("Объём памяти: "+ memoryCapacity).toString();
    }

}

package Stage1_1;

public class Task2 {
    public static void calculate(){
        int firstInt = 114;
        int secondInt = 24;

        float firstFloat = 459.78F;
        float secondFloat = 5;

        System.out.println("Операции с int:\n"
                + firstInt + "+" + secondInt + "=" + (firstInt + secondInt) + "\n"
                + firstInt + "-" + secondInt + "=" + (firstInt - secondInt) + "\n"
                + firstInt + "/" + secondInt + "=" + (firstInt / secondInt) + "\n"
                + firstInt + "%" + secondInt + "=" + (firstInt % secondInt) + "\n"
                + firstInt + "*" + secondInt + "=" + (firstInt * secondInt) + "\n"
                + "Операции с float:\n"
                + firstFloat + "+" + secondFloat + "=" + (firstFloat + secondFloat) + "\n"
                + firstFloat + "-" + secondFloat + "=" + (firstFloat - secondFloat) + "\n"
                + firstFloat + "/" + secondFloat + "=" + (firstFloat / secondFloat) + "\n"
                + firstFloat + "%" + secondFloat + "=" + (firstFloat % secondFloat) + "\n"
                + firstFloat + "*" + secondFloat + "=" + (firstFloat * secondFloat) + "\n");
    }
}

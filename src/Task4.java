public class Task4 {
    public static void showMassive(){
        int[] mass = new int[30];
        for (int i = 0; i < mass.length; i++) {

            mass[i] = i;
            System.out.print(mass[i] + " ");

            if((i + 1) % 10 == 0)
            {
                System.out.println('\n');
            }
        }
    }
}

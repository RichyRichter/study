public class Task7 {
    public static void countBottles(){
        for (int i = 100; i  > 0 ; i--) {
            int chk = i % 10;
            if (chk < 5 && chk > 1)
                System.out.print(i + " бутылки стояли");
            else if(chk == 1)
                System.out.print(i + " бутылка стояла");
            else
                System.out.print(i + " бутылок стояло");

            System.out.println(" на столе, одна из них упала и разбилась.");
        }
    }
}

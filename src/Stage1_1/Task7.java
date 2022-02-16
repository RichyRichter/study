package Stage1_1;

public class Task7 {
    public static void countBottles() {
        for (int i = 100; i > 0; i--) {
            String res = i + " бытылок стояло";
            if (i % 10 == 1)
                res = i + " бутылка стояла";
            if (i % 10 >= 2 && i % 10 <= 4)
                res = i + " бутылки стояло";
            if (i % 100 >= 11 && i % 100 <= 20)
                res = i + " бытылок стояло";

            System.out.println(res + " на столе, одна из них упала и разбилась.");
        }
    }
}


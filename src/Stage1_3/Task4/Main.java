package Stage1_3.Task4;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        String[] input1 = {"Тортик", "очень", "вкусный"};
        String[] input2 = {"Имбирь", "очень", "острый"};
        String[] input3 = {"Федор", "не очень", "злой"};
        BusinessRecord record1 = new BusinessRecord(input1);
        Thread.sleep(1000);
        BusinessRecord record2 = new BusinessRecord(input2);
        Thread.sleep(1000);
        BusinessRecord record3 = new BusinessRecord(input3);
        Diary diary = new Diary();
        diary.addRecord(record2);
        diary.addRecord(record1);
        diary.addRecord(record3);
        System.out.println("Вывод всех записей по порядку");
        diary.showAll(true);
        System.out.println("Вывод всех записей в обратном порядке");
        diary.showAll(false);
        System.out.println("Последняя запись");
        diary.showLast();
    }
}




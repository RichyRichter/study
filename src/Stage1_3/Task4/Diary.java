package Stage1_3.Task4;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Diary {
    private HashSet<BusinessRecord> records = new HashSet<>();


    public boolean addRecord(BusinessRecord record) {
        return records.add(record);
    }

    public BusinessRecord searchByDateTime(LocalDateTime dateTime) {
        for (BusinessRecord record : records) {
            if (record.getCreatedWhen().isEqual(dateTime)) return record;

        }
        return null;
    }

    public boolean delete(LocalDateTime dateTime) {
        return records.remove(searchByDateTime(dateTime));
    }

    public void correct(LocalDateTime dateTime) {
        Scanner scanner = new Scanner(System.in);
        BusinessRecord record = searchByDateTime(dateTime);
        if (Objects.nonNull(record)) {
            System.out.println("Введите новую запись:");
            String[] words = scanner.nextLine().split(" ");
            record.setWordsMass(words);
        }
    }

    public void showByDateTime(LocalDateTime dateTime) {
        BusinessRecord record = searchByDateTime(dateTime);
        if (Objects.nonNull(record)) System.out.println(record);
    }

    public void showAll(boolean order) {
        if (order) {
            records.stream()
                    .sorted(Comparator.comparing(BusinessRecord::getCreatedWhen))
                    .forEach(System.out::println);
        } else {
            records.stream()
                    .sorted(Comparator.comparing(BusinessRecord::getCreatedWhen).reversed())
                    .forEach(System.out::println);
        }
    }

    public void showLast() {
        System.out.println(records.stream().max(Comparator.comparing(BusinessRecord::getCreatedWhen)).get());
    }
}

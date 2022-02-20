package Stage1_2.Bonus;

import java.util.Scanner;

public class ListUse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пример работы со списком.\n" +
                "Введите элементы(целые числа) через пробел, или напишите 'пустой' для создания пустого списка: ");
        String[] splitList = scanner.nextLine().split(" ");
        IntegerArray array = new IntegerArray();

        if (!splitList[0].equals("пустой")) {
            for (String s : splitList) {
                array.add(Integer.parseInt(s));
            }
        }

        for (; ; ) {
            System.out.println("Текщий вид списка: ");
            array.printArray();
            System.out.println("Добавте элемент в список:");
            array.add(scanner.nextInt());
            System.out.println("Текщий вид списка: ");
            array.printArray();
            System.out.println("Добавте элемент по индексу. Укажите индекс добавления и элемент через пробел");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Текщий вид списка: ");
            array.add(a, b);
            array.printArray();
            System.out.println("Удалите элемент по индексу:");
            a = scanner.nextInt();
            array.remove(a);
            System.out.println("Текщий вид списка: ");
            array.printArray();
            System.out.println("Отсортировать список?(1 - да, другое число - нет)");
            a = scanner.nextInt();
            if (a == 1) array.sort();
            System.out.println("Текщий вид списка: ");
            array.printArray();
            System.out.println("Отчистить список или завершить работу?(1 - отчистить, 2 - не отчистить," +
                    "другое число - завршить работу)");
            a = scanner.nextInt();
            if (a == 1) array.clear();
            if (a > 2) break;

        }

    }
}

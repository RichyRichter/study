package Stage1_3.Task1;

import java.util.Scanner;

public class Matrix {
    private static int[][] matrix;

    public static void printCross(int size) {
        matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][i] = 1;
                matrix[i][size - i - 1] = 1;
            }
        }
        printMatrix(matrix);
    }

    public static void printPlusSign(int size) {
        if (size % 2 == 0) throw new IllegalArgumentException("The matrix size is even");
        matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[size / 2][j] = 1;
                matrix[i][size / 2] = 1;
            }
        }
        printMatrix(matrix);
    }

    public static void printSquare(int size) {
        matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[0][j] = 1;
                matrix[i][0] = 1;
                matrix[size - 1][j] = 1;
                matrix[i][size - 1] = 1;
            }
        }
        printMatrix(matrix);
    }

    public static void printRhomb(int size) {
        if (size % 2 == 0) throw new IllegalArgumentException("The matrix size is even");
        matrix = new int[size][size];
        int mid = size / 2; //определяем центр строки
        for (int i = 0; i < size; i++) {
            int delta = Math.abs(mid - i) - mid; //определяем отклонение от центра
            int y1 = mid + delta;
            int y2 = mid - delta;
            matrix[i][y1] = 1;
            matrix[i][y2] = 1;
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        int size = matrix[0].length;
        StringBuilder view = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                view.append(matrix[i][j] + "  ");
            }
            view.append("\n");
        }
        System.out.println(view);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int num;
        System.out.println("Введите размерность матрицы: ");
        size = scanner.nextInt();
        System.out.println("Выберите форму закращенной области матрицы:\n1 - Крест.\n2 - Плюс." +
                "\n3 - Квадрат.\n4 - Ромб. ");

        num = scanner.nextInt();
        switch (num){
            case 1 -> Matrix.printCross(size);
            case 2 -> Matrix.printPlusSign(size);
            case 3 -> Matrix.printSquare(size);
            case 4 -> Matrix.printRhomb(size);

            default -> throw new IllegalStateException("Unexpected value: " + num);
        }

        //Matrix.printCross(9);
        //Matrix.printPlusSign(8);
        //Matrix.printSquare(8);
        //Matrix.printRhomb(7);
    }
}

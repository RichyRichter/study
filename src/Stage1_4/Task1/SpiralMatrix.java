package Stage1_4.Task1;

import java.util.Scanner;

public class SpiralMatrix {
    private static int[][] matrix;
    private static int count = 1;


    public static void spiralSquare(int size) {
        int diff = 0;
        matrix = new int[size][size];
        while (diff < size / 2 + 1) {
            setRow(diff);
            setColumn(diff);
            setRow2(diff);
            setColumn2(diff);
            matrix[diff +2][diff + 1] =count++;
            diff += 2;
        }
        printMatrix(matrix);
    }

    public static void setRow(int save) {
        int size = matrix[0].length;
        for (int i = save; i < size - save; i++) {
            matrix[save][i] = count++;
        }
    }

    public static void setRow2(int save) {
        int size = matrix[0].length;
        for (int i = save + 1; i < size - save; i++) {
            matrix[size - save - 1][size - i - 1] = count++;
        }
    }

    public static void setColumn(int save) {
        int size = matrix[0].length;
        for (int i = save + 1; i < size - save; i++) {
            matrix[i][size - save - 1] = count++;
        }
    }

    public static void setColumn2(int save) {
        int size = matrix[0].length;
        for (int i = save + 2; i < size - save - 1; i++) {
            matrix[size - i][save] = count++;
        }
    }

    private static void printMatrix(int[][] matrix) {
        int size = matrix[0].length;
        StringBuilder view = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                view.append(matrix[i][j] + "\t");
            }
            view.append("\n");
        }
        System.out.println(view);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Введите размерность матрицы: ");
        size = scanner.nextInt();

        spiralSquare(size);
    }
}


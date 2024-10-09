package matrix;

import java.util.Scanner;

public class MatrixBasics {

    static int diagonalsum(int matrix[][]) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // sum of primary dia
            sum += matrix[i][i];
            // sum of secondary dia without overlap
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    static boolean search(int mat[][], int key) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == key) {
                    System.out.println("found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 6);

        int diaMat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = diagonalsum(diaMat);
        System.out.println(sum);
    }
}

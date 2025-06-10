package twoDArrays;

// import java.util.Scanner;

public class Matrices {

    static void spiralMatrix(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }

    // print in spiral form
    static void spiralMatrix1(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static boolean search(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("element found at" + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("element not found");
        return false;
    }

    // Sum of diagonal cell
    static int diagonal(int matrix[][]) {
        int sum = 0;
        // int n = matrix.length;
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (i + j == n - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    // Search in staircase form

    static boolean staircaseSearch(int mat[][], int key) {

        int row = 0;
        int col = mat[0].length - 1;

        while (row < mat.length && col >= 0) {
            if (key == mat[row][col]) {
                System.out.println("found at " + row + "," + col);
                return true;
            } else if (key < mat[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    static boolean staircaseSearchBotToUp(int mat[][], int key) {
        int row = mat.length - 1;
        int col = 0;
        while (col < mat[0].length && row >= 0) {
            if (key == mat[row][col]) {
                System.out.println("( " + row + "," + col + ")");
                return true;
            } else if (key < mat[row][col]) {
                row--;
            } else {
                col++;
            }

        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {

        // int matrix[][] = new int[4][4];
        // int n = matrix.length; // length of row
        // int m = matrix[0].length; // length of column

        // @SuppressWarnings("resource")
        // Scanner s = new Scanner(System.in);

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // matrix[i][j] = s.nextInt();
        // }
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // // search(matrix, 7);
        // System.out.println(search(matrix, 7));

        int matrix1[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        spiralMatrix(matrix1);
        System.out.println(diagonal(matrix1));

        int mat[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int key = 39;
        System.out.println(staircaseSearch(mat, key));
        System.out.println(staircaseSearchBotToUp(mat, 35));
    }
}
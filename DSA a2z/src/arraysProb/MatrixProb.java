package arraysProb;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixProb {

    static void setMatrixZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;

                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {

        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;

    }

    static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        int rotate[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotate[j][n - i - 1] = matrix[i][j];
            }

        }
        return rotate;
    }

    static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int rotated[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        return rotated;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 0 },
                { 2, 4, 6, 1 }
        };
        ArrayList<ArrayList<Integer>> mArrayList = new ArrayList<>();
        mArrayList.add(new ArrayList<>(Arrays.asList(0, 1, 2, 0)));
        mArrayList.add(new ArrayList<>(Arrays.asList(3, 4, 5, 2)));
        mArrayList.add(new ArrayList<>(Arrays.asList(1, 3, 1, 0)));
        mArrayList.add(new ArrayList<>(Arrays.asList(2, 4, 6, 1)));
        setMatrixZeroes(matrix);

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(mArrayList, 4, 4);

        System.out.println("final matrix is ");
        for (ArrayList<Integer> row : ans) {
            for (Integer elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        for (ArrayList<Integer> abc : ans) {
            for (Integer elem : abc) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rotated[][] = rotateMatrix(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

    }
}

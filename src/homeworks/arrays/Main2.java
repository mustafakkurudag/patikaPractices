package homeworks.arrays;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};

        matrix = getTranspoze(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static int[][] getTranspoze(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] newMatrix = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        return newMatrix;
    }
}

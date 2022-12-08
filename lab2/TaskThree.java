import java.util.*;

public class TaskThree {
    /* Двумерные массивы: 21 задача*/

    private static int M = 5;
    
    private static int N = 5;

    public static void main(String[] args) {
        int[][] matrix = getMatrix();

        displayMatrix(matrix);

        System.out.println();

        swapMinAndMax(matrix);

        displayMatrix(matrix);
    }

    private static int[][] getMatrix() {
        Random random = new Random();
        int[][] matrix = new int[M][N];
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] =  random.ints(-10, 10).iterator().nextInt();
            }
        }

        return matrix;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void swapMinAndMax(int[][] matrix) {
        int max = 0;
        int maxRow = 0;
        int maxColumn = 0;

        int min = 0;
        int minRow = 0;
        int minColumn = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] > 0 && matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                } else if (matrix[i][j] < 0 && matrix[i][j] < min) {
                    min = matrix[i][j];
                    minRow = i;
                    minColumn = j;
                }
            }
        }

        int tmp = matrix[maxRow][maxColumn];
        matrix[maxRow][maxColumn] = matrix[minRow][minColumn];
        matrix[minRow][minColumn] = tmp;
    }
}

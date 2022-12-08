import java.util.*;

class TaskFour {
    /* Двумерные массивы: 5 задача */

    private static int M = 3;
    
    private static int N = 5;

    public static void main(String[] args) {
        int[][] matrix = getMatrix();

        displayMatrix(matrix);

        Scanner scanner = new Scanner(System.in);

        System.out.print("from x = ");
        int fromX = scanner.nextInt();

        System.out.print("from y = ");
        int fromY = scanner.nextInt();

        System.out.print("to x = ");
        int toX = scanner.nextInt();

        System.out.print("to y = ");
        int toY = scanner.nextInt();

        System.out.println(sumFromToCords(matrix, fromX, fromY, toX, toY));
    }

    private static int[][] getMatrix() {
        Random random = new Random();
        int[][] matrix = new int[M][N];
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] =  random.nextInt(10);
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

    private static int sumFromToCords(int[][] matrix, int fromX, int fromY, int toX, int toY) {
        int linearFromCords = fromY * N + fromX;
        int linearToCords = toY * N + toX;

        if ((linearFromCords < 0 || linearFromCords > (M * N)) ||
            (linearToCords < 0 || linearToCords > (M * N))
        ) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < M * N; i++) {
            if (i >= linearFromCords && i <= linearToCords) {
                sum += matrix[i / N][i % N];
            }
        }

        return sum;
    }
}

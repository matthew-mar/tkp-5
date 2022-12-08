import java.util.*;

public class TaskOne {
    /* Одномерные массивы: 21 задача */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int[] a = getArray();

        displayArray(a);

        mostCloseAverage(a, x);

        scanner.close();
    }

    private static int[] getArray() {
        Random random = new Random();

        int ARRAY_SIZE = 6;
        int[] arr = new int[ARRAY_SIZE];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        return arr;
    }

    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    private static void mostCloseAverage(int[] array, int x) {
        int a = 0, b = 0;
        int minDistance = 10_000;
        int len = array.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int average = (array[i] + array[j]) / 2;
                int xDistance = Math.abs(average - x);

                if (xDistance == 0) {
                    System.out.printf("%d %d\n", array[i], array[j]);
                    return;
                }

                if (xDistance < minDistance) {
                    minDistance = xDistance;
                    a = array[i];
                    b = array[j];
                }
            }
        }

        System.out.printf("%d %d\n", a, b);
    }
}

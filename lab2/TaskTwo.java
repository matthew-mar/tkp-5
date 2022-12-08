import java.util.*;

class TaskTwo {
    /* Одномерные массивы: 4 задача */

    public static void main(String[] args) {
        int[] arr = getArray();

        displayArray(arr);

        reverseArray(arr);

        displayArray(arr);
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

    private static void reverseArray(int[] array) {
        int len = array.length;

        for (int i = 0; i < len / 2; i++) {
            int tmp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = tmp;
        }
    }
}

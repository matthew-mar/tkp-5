import java.util.*;

class TaskOne {
    /* 
      * Напишите программу с методом для отображения 
      * текстовой строки в обратном порядке 
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string: ");
        String str = scanner.nextLine();

        System.out.print("reversed string: ");
        showReverse(str);

        scanner.close();
    }

    private static void showReverse(String str) {
        StringBuffer reverseString = new StringBuffer(str);
        reverseString.reverse();
        System.out.println(reverseString);
    }
}

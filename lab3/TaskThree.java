import java.util.*;

class TaskThree {
    /*
     * Напишите программу с методом, которым текст отображается в консоли, 
     * причем каждое слово из текста отображается в отдельной строке.
     */

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string: ");
        String line = scanner.nextLine();

        System.out.println("line in a row:");
        rowRepresentation(line);

        scanner.close();
    }

    public static void rowRepresentation(String line) {
        String[] lineWords = line.split(" ");

        for (String word : lineWords) {
            System.out.println(word);
        }
    }
}

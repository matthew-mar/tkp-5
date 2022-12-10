import java.util.Scanner;

class TaskTwo {
    /* 
     * Напишите программу с методом для подсчета количества вхождений 
     * символа в текстовую строку 
    */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter string: ");
        String str = scanner.nextLine();

        System.out.print("enter symbol: ");
        char symb = scanner.nextLine().charAt(0);

        System.out.printf("count: %d\n", countChar(str, symb));

        scanner.close();
    }

    public static int countChar(String str, char symb) {
        StringBuffer strBuff = new StringBuffer(str);
        int counter = 0;
        
        for (int i = 0; i < strBuff.length(); i++) {
            if (strBuff.charAt(i) == symb) {
                counter++;
            }
        }

        return counter;
    }
}

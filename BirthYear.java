import java.util.*;


public class BirthYear {
    private static int CURRENT_YEAR = 2022;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        int birthYear = CURRENT_YEAR - age;

        System.out.printf("Hello %s, you was born in %d\n", name, birthYear);
    }
}


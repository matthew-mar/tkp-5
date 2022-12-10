import java.util.*;

class TaskFour {
    /*
     * Напишите программу, в которой определяется время и дата 
     * через 1 000 000 секунд после текущей даты и времени.
     */

    public static void main(String[] args) {
        Date currentDateTime = new Date();

        System.out.print("current datetime: ");
        System.out.println(currentDateTime);

        System.out.print("datetime in million seconds: ");
        System.out.println(timeInMillionSeconds(currentDateTime));
    }

    private static Date timeInMillionSeconds(Date date) {
        return new Date(date.getTime() + 1_000_000);
    }
}

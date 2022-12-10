import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class TaskFive {
    /*
     * Напишите программу, в которой на заданном интервале времени случайно 
     * выбирается дата и время, и для этой даты отображается день недели.
     */

    public static void main(String[] args) {
        String dateFormat = "yyyy-MM-dd HH:mm";
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);

        Scanner scanner = new Scanner(System.in);

        System.out.printf("enter from date string in format %s\n", dateFormat);
        String fromTimeString = scanner.nextLine();

        System.out.printf("enter to date string in format %s\n", dateFormat);
        String toTimeString = scanner.nextLine();

        scanner.close();

        Date fromDateTime = getDateFromString(formatter, fromTimeString);
        Date toDateTime = getDateFromString(formatter, toTimeString);

        Date startDateTime = new Date(0);
        if (fromDateTime.equals(startDateTime) || 
            toDateTime.equals(startDateTime)
        ) {
            System.out.printf("failed parse string to date");
            return;
        }

        if (fromDateTime.equals(toDateTime)) {
            System.out.println("dates can't be equal");
        }

        Date randomDate = getRandomDate(
            fromDateTime.getTime(), 
            toDateTime.getTime()
        );
        System.out.print("random date: ");
        System.out.println(randomDate);

        System.out.printf("week day: %s\n", getWeekDay(randomDate));
    }

    private static Date getDateFromString(
        SimpleDateFormat formatter, 
        String dateString
    ) {
        try {
            return formatter.parse(dateString);
        } catch (ParseException e) {
            return new Date(0);
        }
    }

    private static Date getRandomDate(Long fromTime, long toTime) {
        long randomTime = new Random()
            .longs(fromTime, toTime)
            .iterator()
            .nextLong();

        return new Date(randomTime);
    }

    private static String getWeekDay(Date date) {
        return new SimpleDateFormat("E").format(date);
    }
}

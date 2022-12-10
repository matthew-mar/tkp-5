import java.text.SimpleDateFormat;
import java.util.*;;

class TaskSix {
    /*
     * Напишите программу, в которой дата выводится в формате, 
     * в котором сначала следует год, затем месяц, после этого – день месяца.
     */

    public static void main(String[] args) {
        Date currentDate = new Date();

        System.out.println(new SimpleDateFormat("yyyy-MM dd")
            .format(currentDate));
    }
}

package prj08CalDateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Testing calendar, date and time===");

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        calendar.add(Calendar.MONTH, 4);
        calendar.add(Calendar.SECOND, 40);
        System.out.println(calendar.getTime());

        calendar.setTimeInMillis(System.currentTimeMillis());
        long timestamp = calendar.getTime().getTime();
        System.out.println(timestamp);
        System.out.println(System.currentTimeMillis());
    }
}

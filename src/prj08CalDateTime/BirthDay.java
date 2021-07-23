/*
* Дату рождения задавайте используя три переменные:
int day = 31;
int month = 12;
int year = 1990;

Формат требуемого вывода:
    0 - 31.12.1990 - Mon
    1 - 31.12.1991 - Tue
    …

* */
package prj08CalDateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Locale;

public class BirthDay {
    public static void main(String[] args) {
        int day = 16;
        int month = 4;
        int year = 1982;

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EEEE", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();

        int count = 0;
        int maxYear = calendar.get(Calendar.YEAR);
        while (year <= maxYear) {
            calendar.set(year, month, day);
            System.out.println(count + " - " + dateFormat.format(calendar.getTime()));
            year++; count++;
        }

    }
}

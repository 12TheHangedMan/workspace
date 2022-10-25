package DateTimeExample;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.EnumSet;

import static java.time.temporal.TemporalAdjusters.next;

public class DateAndTime {
}

class DateAndTimeClient{
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        System.out.print("today = " + today);
        LocalDate theDayAfterTomorrow = today.plusDays(2);
        System.out.print("theDayAfterTomorrow = " + theDayAfterTomorrow);
        LocalDate localDate = LocalDate.of(2016, Month.AUGUST, 23);
        System.out.println("localDate = " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDate localDate1 = LocalDate.parse("1968-02-24");
        System.out.println(localDate1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        //LocalDate localDate2 = LocalDate.parse("12-Feb-2008", dateTimeFormatter);
        //System.out.println(localDate2);

        LocalDate localDate3 = LocalDate.of(2020,10,18);
        String format = localDate3.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(format);
        System.out.println(localDate3.format(DateTimeFormatter.ofPattern("EEE, MMM-dd-yyyy")));

        int dayOfMonth = localDate3.getDayOfMonth();
        Month month = localDate3.getMonth();
        int monthValue = month.getValue();
        monthValue = localDate3.getMonthValue();
        DayOfWeek dayOfWeek = localDate3.getDayOfWeek();
        System.out.println(dayOfWeek);

        int ii = localDate3.get(ChronoField.DAY_OF_WEEK);
        System.out.println(ii);

        LocalDate nextSunday = LocalDate.now().with(next(DayOfWeek.SUNDAY));
        System.out.println(nextSunday);


    }
}

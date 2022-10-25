/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.time.*;
import java.time.format.*;

class DateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
         testNow();
         testCreate();
         testParse();
         testFormat();
    }

    /**
     * TASK: create current date, time, and date-time via now() and then print them.
     */
    public static void testNow() {
        // TODO
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println(currentDate);
        System.out.println(currentTime);
        System.out.println(currentDateTime);
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testCreate() {
        // TODO: create your birthday via of(). What day of the week were you born on?
        LocalDate myBirthday = LocalDate.of(1988, 10, 25);
        System.out.println(myBirthday.getDayOfWeek());
        // TODO: use of() to create a value representing the 1st lunar landing - it happened on 7/20/69 at 3:18pm Eastern Time.
        // NOTE: ignore time-zone, just assume Eastern Time is the local time.
        LocalDateTime FirstLunarLandingDateTime = LocalDateTime.of(1969,7,20,15,18);
        System.out.println(FirstLunarLandingDateTime);
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testParse() {
        // TODO: create your birthday by parsing a text representation in standard format ("yyyy-MM-dd").

        String myBirthdayString = "1988-10-25";
        LocalDate myBirthday = LocalDate.parse(myBirthdayString);
        System.out.println(myBirthday);
        // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
        String parsingPattern = "MM/dd/yyyy";
        DateTimeFormatter defaultFormat = DateTimeFormatter.ofPattern(parsingPattern);
        String myBirthdayToString = myBirthday.format(defaultFormat);
        System.out.println(myBirthdayToString);

    }

    /**
     * TASK: create formatted display strings for the date below, in the specified formats.
     */
    public static void testFormat() {
        LocalDate hastings = LocalDate.of(1066, 10, 14);

        String pattern1 = "MM/dd/yyyy";
        String pattern2 = "dd-MM-yyyy";
        String pattern3 = "MMM dd, yyyy";
        // TODO: 10/14/1066

        String hastingsFormat1 = hastings.format(DateTimeFormatter.ofPattern(pattern1));
        // TODO: 14-10-1066
        String hastingsFormat2 = hastings.format(DateTimeFormatter.ofPattern(pattern2));
        // OPTIONAL: October 14, 1066
        String hastingsFormat3 = hastings.format(DateTimeFormatter.ofPattern(pattern3));

        System.out.println(hastingsFormat1);
        System.out.println(hastingsFormat2);
        System.out.println(hastingsFormat3);
    }
}
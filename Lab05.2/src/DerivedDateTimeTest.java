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
import javax.sound.midi.SysexMessage;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.TemporalAdjusters.*;

class DerivedDateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
         testPresidentsFirst100Days();
         testPopularBirthdays();
         testEarlyRetirement();
         testLaborDay();
         testElectionDay();
         testAnniversary();
    }

    /**
     * TASK: new American presidents are often measured by their performance during the first 100 days in office.
     * Inauguration Day 2017 is Jan 20.  When is this president's 100-day deadline?
     *
     * RESULT:
     */
    public static void testPresidentsFirst100Days() {
        // TODO
        LocalDate president1stDay = LocalDate.of(2017, 1, 20);
        System.out.println(president1stDay.plusDays(100));
    }

    /**
     * TASK: Certain times of the year seem to have more birthdays than other times.
     * Some believe that this is because more babies are conceived during certain times of year.
     * Below, assume a due date 38 weeks after conception, during a non-leap-year.
     *
     * RESULT:
     */
    public static void testPopularBirthdays() {
        // TODO: what is the average birthday of someone conceived on Valentine's Day?
        String valentinesDayString = "2022-02-14";
        LocalDate valentinesDay = LocalDate.parse(valentinesDayString);
        System.out.println(valentinesDay.plus(38, ChronoUnit.WEEKS));
        // TODO: what is the average birthday of someone conceived on New Year's Eve (after midnight)?
        String newYearEveString = "2022-01-01";
        LocalDate newYearEve = LocalDate.parse(newYearEveString);
        System.out.println(newYearEve.plus(38, ChronoUnit.WEEKS));
    }

    /**
     * TASK: you've saved diligently your whole life and plan to retire as soon as
     * you can take distributions from your 401(k) penalty-free, which is when you turn 59 1/2.
     * When will / did you retire?
     *
     * RESULT:
     */
    public static void testEarlyRetirement() {
        // TODO
        String myBirthdayString = "1988-10-25";
        LocalDate myBirthday = LocalDate.parse(myBirthdayString);
        LocalDate retireDate = myBirthday
                .plus(59, ChronoUnit.YEARS)
                .plus(6, ChronoUnit.MONTHS);
        System.out.println(retireDate);
    }

    /**
     * TASK: when was Labor Day during the year you were born?
     * Note: start with a LocalDate equal to your birthday.
     * Note: Labor Day is the first Monday in Sept.
     *
     * RESULT:
     */
    public static void testLaborDay() {
        // TODO
        String birthdayString = "1988-10-25";
        LocalDate birthday = LocalDate.parse(birthdayString);
        LocalDate testDay = LocalDate.of(1988,9,1);
        int days = testDay.getDayOfWeek().getValue();
        int plusDays = 0;
        if(days>1) {
            plusDays = 8-days;
        }
        System.out.println(testDay.plusDays(plusDays));
    }

    /**
     * TASK: Election Day in the United States is defined as the Tuesday immediately after the 1st Monday in November.
     * When is Election Day 2024?
     *
     * RESULT:
     */
    public static void testElectionDay() {
        // TODO
        LocalDate november1st = LocalDate.of(2024,11,01);
        int days = november1st.getDayOfWeek().getValue();
        int plusDays = 0;
        if(days<2) {
            plusDays = 1;
        } else {
            plusDays = 9 - days;
        }
        System.out.println(november1st.plusDays(plusDays));
    }

    /**
     * TASK: Akesh and Samanta were married on 6/6/1969.
     * They are planning their 50th wedding anniversary, and would like to throw a big party.
     * If their anniversary does not fall on a Saturday, they'd like to have their party the following Saturday.
     * What is the date of the party?
     *
     * RESULT:
     */
    public static void testAnniversary() {
        // TODO
        LocalDate anniversary = LocalDate.of(1969,6,6);
        LocalDate anniversary50th = anniversary.plusYears(50);
        int days = anniversary50th.getDayOfWeek().getValue();
        int plusDays = 0;
        if(days < 6) {
            plusDays = 6 - days;
        } else if (days == 7){
            plusDays = 6;
        }
        System.out.println(anniversary50th.plusDays(plusDays));
    }
}
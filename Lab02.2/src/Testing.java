import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.EnumSet;
import java.util.Locale;

public class Testing {

    void test(){
        for(int i = 5; i > 0; i--){
            System.out.println(i);
        }
    }




}

enum Day {
    day1, day2, day3;
}

class TestMain{
    public static void main(String[] args){
        for(Day day : EnumSet.range(Day.day1, Day.day3)){

        }
        Day day;
        //LocalDateTime
        //LocalDate
        //LocalTime
        String test = "Prime";
        System.out.println(test.toUpperCase(Locale.ROOT));
        System.out.println(test);

    }
}

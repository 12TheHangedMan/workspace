import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Locale;
import java.io.*;

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
        String[] stringA = {"Hello", "Boston"};
        String[] stringB = {"Hello", "Boston"};
        String[] stringC = {"Boston", "Hello"};
        System.out.println(Arrays.equals(stringA, stringB));
        System.out.println(Arrays.equals(stringA, stringC));

        String string = "I love boston, yes, I love boston";
        string = string.toLowerCase(Locale.ROOT);
        String[] outputString = string.split("[, !@#$%^&*,.?+= ]");
        System.out.println(Arrays.toString(outputString));
        int[] stringPointers = new int[outputString.length];

        int index = 1;
        boolean flag = false;
        for (int i=0; i< outputString.length;i++) {
            for(int j = 1; j<=index; j++)
            {
                if(outputString[i].equals(outputString[stringPointers[j]])) {
                    break;
                } else {
                    if(j==index) {
                        stringPointers[index] = i;
                        index++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(stringPointers));
    }

    static void swap(Integer a, Integer b) {
        int c = a;
        a = b;
        b = c;
        return;
    }
}

import java.lang.reflect.Array;
import java.util.Locale;

class Exercise_1_Array_of_String {
    static class ArrayExample{
        static void convertAndDisplayNamesToUpperCase(){
            String[] myFamily = new String[]{"Ma", "Lucas", "Jiao"};
            for(String name : myFamily)
            {
                System.out.print(name.toUpperCase(Locale.ROOT) + " ");
            }
            System.out.println();
        }


    }
}

class Exercise_2_Array_of_int{
    static int[] findOddNumbersFromArray(int[] numbers){
        int oddNumbersCount = 0;
        for(int number : numbers) {
            if(number%2 == 1){
                oddNumbersCount++;
            }
        }
        int[] resultInt = new int[oddNumbersCount];
        oddNumbersCount = 0;
        for(int number : numbers) {
            if(number%2 == 1){
                resultInt[oddNumbersCount]=number;
                oddNumbersCount++;
            }
        }
        return resultInt;
    }
}

class Exercise_3_Array_of_int{
    static int findLargestNumberFromArray(int[] numbers){
        int largestNumber = numbers[0];
        for(int number : numbers){
            if(number > largestNumber){
                largestNumber = number;
            }
        }
        return largestNumber;
    }
}

class Exercise_4_varargs{
    static void convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs(String myName, String ... myFriends){
         for(String names : myFriends){
             System.out.print(names.toUpperCase(Locale.ROOT)+" ");
         }
        System.out.println();
    }
}

class ExerciseClient{
    public static void main(String[] args){
        Exercise_1_Array_of_String.ArrayExample.convertAndDisplayNamesToUpperCase();
        for(int number : Exercise_2_Array_of_int.findOddNumbersFromArray(new int[]{1,2,3,4,5,6,7,8,9})){
            System.out.print(number+ " ");
        }
        System.out.println();
        System.out.print(Exercise_3_Array_of_int.findLargestNumberFromArray(new int[]{8,3,2,1,4,5,6,10,8,2,3}));
        System.out.println();
        Exercise_4_varargs
                .convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Ma","friend1");
        Exercise_4_varargs
                .convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Ma","friend1","friend2");
        Exercise_4_varargs
                .convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Ma","friend1","friend2", "friend3");
    }
}

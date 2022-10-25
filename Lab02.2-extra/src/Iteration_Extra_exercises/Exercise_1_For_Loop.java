package Iteration_Extra_exercises;

public class Exercise_1_For_Loop {
    static class Iteration{
        static void displayNumbersUsingForLoop(int start, int end){
            for(int i = start; i<=end;i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

class Exercise_2_while{
    static void displayNumbersUsingWhile(int start, int end) {
        int i = start;
        while(i <= end)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}

class Exercise_3_do_while{
    static void displayNumbersUsingDoWhile(int start, int end){
        int i = start;
        do{
            System.out.print(i + " ");
            i++;
        }
        while(i<=end);
        System.out.println();
    }
}

class Exercise_4_For_Loop_with_If{
    static void displayEvenNumbersOnlyUsingForLoop(int start, int end){
        for(int i = start; i <= end; i+=2)
        {
            if(i%2 == 1 && i + 1 <= end ) {
                i+=1;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Main{
    public static void main(String[] args){
        Exercise_1_For_Loop.Iteration.displayNumbersUsingForLoop(2,7);
        Exercise_2_while.displayNumbersUsingWhile(2,7);
        Exercise_3_do_while.displayNumbersUsingDoWhile(2,7);
        Exercise_4_For_Loop_with_If.displayEvenNumbersOnlyUsingForLoop(1,7);
    }
}

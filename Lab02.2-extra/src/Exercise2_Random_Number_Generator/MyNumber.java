package Exercise2_Random_Number_Generator;

public class MyNumber {

    static int computeRandomInt(int start, int end) {
        int diff = (end - start);
        return (int) (diff * Math.random()) + start;
    }
}

class FlowControl {
    static boolean isItEvenNumber(int number) {
        return number % 2 == 0;
    }
}

class MyNumberMain {
    public static void main(String[] args) {
        int a = MyNumber.computeRandomInt(-13213, 123420);
        String result = "odd";
        if (FlowControl.isItEvenNumber(a)) {
            result = "even";
        }
        System.out.println(a + " is an " + result + " number.");
    }
}

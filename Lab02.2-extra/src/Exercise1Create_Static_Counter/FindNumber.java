package Exercise1Create_Static_Counter;

import java.util.Random;

public class FindNumber {
    private static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    void run() {
        Random rdGenerator = new Random();
        int a = 100000;
        int c = 0;
        int b = rdGenerator.nextInt(a);
        programCore(a, c, c, b);
        System.out.print("Random Number is " + b + " and it takes program ");
    }

    void programCore(int a, int c1, int c2, int b) {
        counter++;
        if (b == a || b == c1) {
            return;
        }
        if (b > c1) {
            c2 = c1;
            c1 = (a + c1) / 2;
        } else {
            a = c1;
            c1 = c2;
        }
        programCore(a, c1, c2, b);
    }
}

class FindNumberMain {
    public static void main(String[] args) {
        FindNumber f1 = new FindNumber();
        f1.run();
        System.out.println(FindNumber.getCounter() + " times to find it out using binary search.");
    }
}

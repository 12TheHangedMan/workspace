package Exercise3_Create_Your_Own_Math_Utility;

import java.awt.*;

public class MyMath {
    private static final int MINIMUM_AGE = 5;
    private static final int MAXIMUM_AGE = 100;

    public static boolean isAgeInRange(int age) {
        if (age < 5 || age > 100) {
            return false;
        }
        return true;
    }

    static int min(int x, int y) {
        if (x < y) {
            return x;
        }
        return y;
    }

    static int max(int x, int y) {
        if (x < y) {
            return y;
        }
        return x;
    }
}

class MyMathMain {
    public static void main(String[] args) {
        System.out.println(MyMath.max(100, 200));
        System.out.println(MyMath.min(100, 200));
        System.out.println(MyMath.isAgeInRange(4));
        System.out.println(MyMath.isAgeInRange(5));
        System.out.println(MyMath.isAgeInRange(6));
        System.out.println(MyMath.isAgeInRange(100));
        System.out.println(MyMath.isAgeInRange(101));

        System.out.println((2<3) && (3>40) || (40>4));



        try{
            Robot robot = new Robot();
            robot.mouseMove(500,500);
        }
        catch(AWTException e) {

        }


    }
}

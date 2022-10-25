package AlarmClock;

import com.sun.jdi.Value;

public class AlarmClock {
    public void setSec(int x) {
        this.sec = x;
    }

    int sec;

    void accessor(int sec) {
        this.sec += sec;
    }

    void output() {
        System.out.println("current sec is " + sec);
    }

    public String toString() {
        return "" + sec;
    }
}

class AlarmClockMain {
    public static void main(String[] args) {
        AlarmClock C1 = new AlarmClock();
        C1.accessor(3);
        C1.output();
        C1.setSec(1);
        C1.output();
        System.out.println(C1.getClass());
    }
}

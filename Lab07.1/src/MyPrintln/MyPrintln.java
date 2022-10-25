package MyPrintln;

public class MyPrintln {
    public void MyPrintln(String x) {
        System.out.println(x);
    }

    public void MyPrintln(int x) {
        System.out.println(x);
    }

    public void MyPrintln(double x) {
        System.out.println(x);
    }
}

class MyPrintlnMain {
    public static void main(String[] args) {
        MyPrintln PrintFunction = new MyPrintln();
        PrintFunction.MyPrintln("32.00");
        PrintFunction.MyPrintln(32);
        PrintFunction.MyPrintln(32.00);
    }
}

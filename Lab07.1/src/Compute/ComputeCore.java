package Compute;

public class ComputeCore {
    public long add(int x, int y){
        return (long)x+(long)y;
    }

    public long add(long x, long y){
        return x+y;
    }

    public long add(long x, int y){
        return x + (long)y;
    }

    public long add(int x, long y){
        return (long)x + y;
    }

    public long subTract(int x, int y){
        return (long)x-(long)y;
    }

    public long subTract(long x, long y){
        return x-y;
    }

    public long subTract(long x, int y) {
        return (long)x-(long)y;
    }

    public long subTract(int x, long y){
        return (long)x-(long)y;
    }
}

class ComputeMain{
    public static void main(String[] args){
        ComputeCore CPUCore = new ComputeCore();
        System.out.println(CPUCore.add(100, 100L));
    }
}



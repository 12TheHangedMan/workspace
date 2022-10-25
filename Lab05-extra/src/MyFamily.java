import java.util.EnumSet;

public enum MyFamily {
    Ma, Lucas, Jiao
}

class MyFamilyClient{
    public static void main(String[] args){
        for(MyFamily family : MyFamily.values()) {
            System.out.print(family.toString() + " ");
        }

        for(MyFamily family : EnumSet.range(MyFamily.Ma, MyFamily.Jiao)) {
            System.out.print(family.toString() + " ");
        }
    }
}
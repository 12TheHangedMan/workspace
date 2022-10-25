import com.sun.jdi.Value;

//Exercise#1
public class WrapperExample {
    int convertStringToIntPrimitive(String toBeConvertedString) {
        int result = 0;
        result = Integer.parseInt(toBeConvertedString);
        return result;
    }
    Integer convertStringToIntegerObject(String toBeConvertedString) {
        Integer result = 0;
        result = Integer.getInteger(toBeConvertedString);
        return result;
    }

}

class WrapperExampleClient{
    public static void main(String[] args){

    }
}

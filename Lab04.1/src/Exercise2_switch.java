public class Exercise2_switch {
    static int hexCharToDecimal(char hexChar) {
        int result = 0;
        switch(hexChar){
            case 'A':
                result = 10;
                break;
            case 'B':
                result = 11;
                break;
            case 'C':
                result = 12;
                break;
            case 'D':
                result =13;
                break;
            case 'E':
                result = 14;
                break;
            case 'F':
                result = 15;
                break;
            default:
                result = hexChar;
                result -= 48;
        }
        return result;
    }
}

class Main{
    public static void main(String[] args){
        System.out.println(Exercise2_switch.hexCharToDecimal('9'));
    }
}

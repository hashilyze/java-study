package this_is_java.ch2.ex4;

public class Promotion {
    public static void main(String[] args){
        byte byteValue1 = 10;
        int intValue1 = byteValue1;
        System.out.println("intValue: " + intValue1);

        char charValue1 = '가';
        int intValue2 = charValue1;
        System.out.println("intValue: " + intValue2);

        int intValue3 = 50;
        long longValue1 = intValue3;
        System.out.println("longValue: " + longValue1);

        long longValue2 = 100;
        float floatValue = longValue2;
        System.out.println("floatValue: " + floatValue);
    }
}

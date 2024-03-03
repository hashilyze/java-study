package this_is_java.ch2.ex5;

public class Casting {
    public static void main(String[] args){
        byte byteValue;
        char charValue;
        int intValue;
        long longValue;
        float floatValue;

        intValue = 257;
        byteValue = (byte)intValue;
        System.out.println("byteValue: " + byteValue);

        byteValue = 65;
        charValue = (char)byteValue;
        System.out.println("charValue: " + charValue);

        floatValue = 3.14f;
        intValue = (int)floatValue;
        System.out.println("intValue: " + intValue);
    }
}

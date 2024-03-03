package this_is_java.ch2.ex2;

public class VariableExchange {
    public static void main(String[] args){
        int x = 3;
        int y = 5;
        System.out.println("x: " + x + ", y: " + y);

        int temp = x;
        x = y;
        y= temp;
        System.out.println("x: " + x + ", y: " + y);
    }

}

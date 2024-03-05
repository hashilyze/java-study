package java_start.ch9;

public class ex2 {
    public static void main(String[] args) {
        String message = "Hello, world!";

        eco(message, 3);
        eco(message, 5);
        eco(message, 7);
    }
    private static void eco(String message, int times){
        for(int i = 0; i < times; ++i){
            System.out.println(message);
        }
    }
}

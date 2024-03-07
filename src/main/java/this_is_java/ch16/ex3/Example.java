package this_is_java.ch16.ex3;

public class Example {
    public static double calc(Function fun){
        double x = 10, y = 4;
        return fun.apply(x, y);
    }

    public static void main(String[] args) {
        double result = calc((x, y) -> x / y);
        System.out.println("result: " + result);
    }
}

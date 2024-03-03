package java_start.ch5;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("while:");
        int count = 0;
        while(count++ < 10){
            System.out.println(count);
        }

        System.out.println("for:");
        for(int i = 1; i <= 10; ++i){
            System.out.println(i);
        }
    }
}

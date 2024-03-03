package java_start.ch5;

public class ex2 {
    public static void main(String[] args) {
        int num = 1, count = 0;

        while(count < 10){
            if(num % 2 == 0){
                System.out.println(num);
                ++count;
            }
            ++num;
        }
    }
}

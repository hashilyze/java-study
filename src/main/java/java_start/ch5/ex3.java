package java_start.ch5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int max, sum = 0;

        Scanner scanner = new Scanner(System.in);
        max = scanner.nextInt();

        int i = 0;
        while(i++ < max){
            sum += i;
        }
        System.out.println(sum);
    }
}

package java_start.ch8;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int n = 5;
        int[] numbers = new int[n];

        Scanner scanner = new Scanner(System.in);
        System.out.println(n + "개의 정수를 입력하세요: ");
        for(int i = 0; i < n; ++i){
            numbers[i] = scanner.nextInt();
        }

        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("합계: " + total);
        System.out.println("평균: " + (double)total / numbers.length);
    }
}

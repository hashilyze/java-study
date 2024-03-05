package java_start.ch8;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println(n + "개의 정수를 입력하세요: ");
        for(int i = 0; i < n; ++i){
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0], max = numbers[0];
        for (int number : numbers) {
            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        }
        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);
    }
}

package java_start.ch8;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int n = 5;
        int[] numbers = new int[n];

        Scanner scanner = new Scanner(System.in);
        System.out.println(n + "개의 정수를 입력하세요: ");
        for(int i = 0; i < n; ++i){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("출력");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }
}

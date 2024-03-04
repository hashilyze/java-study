package java_start.ch7;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        num2 = scanner.nextInt();

        if(num1 > num2) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        System.out.print("두 숫자 사이의 모든 정수: ");
        for(int i = num1; i <= num2; ++i){
            System.out.print(i + ", ");
        }
        System.out.println("");
    }
}

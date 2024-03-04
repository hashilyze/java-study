package java_start.ch7;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("하나의 정수를 입력하세요: ");
        num = scanner.nextInt();

        if(num % 2 == 1){
            System.out.println("입력한 정수 " + num + "은 홀수입니다.");
        } else{
            System.out.println("입력한 정수 " + num + "은 짝수입니다.");
        }
    }
}

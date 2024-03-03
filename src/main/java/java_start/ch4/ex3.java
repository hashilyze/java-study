package java_start.ch4;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int dollar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("dollar: ");
        dollar = scanner.nextInt();

        if(dollar < 0){
            System.out.println("잘못된 금액입니다.");
        } else if(dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        } else{
            int won = dollar * 1300;
            System.out.println("환전 금액은 " + won + "원입니다.");
        }
    }
}

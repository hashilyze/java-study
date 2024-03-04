package java_start.ch7;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단의 단 수를 입력해주세요: ");
        num = scanner.nextInt();

        System.out.println(num + "단의 구구단: ");
        for(int i = 1; i <= 9; ++i){
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }
}

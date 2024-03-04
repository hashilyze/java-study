package java_start.ch7;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요: ");
        name = scanner.nextLine();
        System.out.print("당신의 나이를 입력하세요: ");
        age = scanner.nextInt();
        System.out.printf("당신의 이름은 %s이고, 나이는 %d살입니다.\n", name, age);
    }
}

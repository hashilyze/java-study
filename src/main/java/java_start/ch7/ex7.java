package java_start.ch7;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String name;
            int age;

            System.out.print("이름을 입력하세요(종료를 입력하면 종료): ");
            name = scanner.nextLine();

            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            age = Integer.parseInt(scanner.nextLine());

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}

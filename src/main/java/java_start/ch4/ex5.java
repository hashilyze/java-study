package java_start.ch4;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        String grade;

        System.out.print("grade: ");
        Scanner scanner = new Scanner(System.in);
        grade = scanner.nextLine();

        switch(grade){
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다!");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }
    }
}

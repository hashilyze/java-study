package java_start.ch4;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int score;
        char grade;

        Scanner scanner = new Scanner(System.in);
        System.out.print("score: ");
        score = Integer.parseInt(scanner.nextLine());

        if(90 <= score){
            grade = 'A';
        } else if(80<= score){
            grade = 'B';
        } else if(70 <= score){
            grade = 'C';
        } else if(60 <= score){
            grade = 'D';
        } else{
            grade = 'F';
        }

        System.out.println("학점은 "+ grade +"입니다.");
    }
}

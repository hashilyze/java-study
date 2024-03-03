package java_start.ch4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        double rating;

        Scanner scanner = new Scanner(System.in);
        System.out.print("rating: ");
        rating = scanner.nextDouble();

        if(rating <= 9.0){
            System.out.println("\'어바웃타임\'을 추천합니다.");
        }
        if(rating <= 8.0){
            System.out.println("\'토이 스토리\'을 추천합니다.");
        }
        if(rating <= 7.0){
            System.out.println("\'고질라\'을 추천합니다.");
        }

    }
}

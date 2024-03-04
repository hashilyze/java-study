package this_is_java.ch5;

import java.util.Scanner;

public class ex5 {
    private static Scanner scanner;
    private static int[] scores = null;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.print("선택> ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> allocateStudents();
                case 2 -> writeScores();
                case 3 -> listScores();
                case 4 -> analyzeScore();
                case 5 -> quit();
                default -> System.out.println("올바른 번호를 입력하세요.");
            }
        }
    }

    private static void allocateStudents(){
        System.out.print("학생수> ");
        int num = Integer.parseInt(scanner.nextLine());
        scores = new int[num];
    }

    private static void writeScores(){
        if(scores == null || scores.length == 0){
            System.out.println("먼저 학생을 등록하세요.");
            return;
        }
        for(int i = 0; i < scores.length; ++i){
            System.out.printf("scores[%d]> ", i);
            int inputScore = Integer.parseInt(scanner.nextLine());
            scores[i] = inputScore;
        }
    }

    private static void listScores(){
        if(scores == null || scores.length == 0){
            System.out.println("먼저 학생을 등록하세요.");
            return;
        }
        for(int i = 0; i < scores.length; ++i){
            System.out.printf("scores[%d]: %d\n", i, scores[i]);
        }
    }

    private static void analyzeScore(){
        if(scores == null || scores.length == 0){
            System.out.println("먼저 학생을 등록하세요.");
            return;
        }
        int sum = 0, max = scores[0];
        for(int score : scores){
            sum += score;
            if(score > max){
                max = score;
            }
        }
        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + (double)sum / scores.length);
    }

    private static void quit(){
        System.out.println("프로그램 종료");
        System.exit(0);
    }
}

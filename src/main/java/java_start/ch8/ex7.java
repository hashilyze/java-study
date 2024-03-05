package java_start.ch8;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[][] students;
        String[] subjects = { "국어", "영어", "수학" };

        System.out.print("학생 수를 입력하세요: ");
        n = scanner.nextInt();
        students = new int[n][subjects.length];

        for(int i = 0; i < n; ++i){
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for(int j = 0; j < subjects.length; ++j){
                System.out.print(subjects[j] + " 점수: ");
                students[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; ++i) {
            int sum = 0;
            double aver;

            for (int score : students[i]) {
                sum += score;
            }
            aver = (double)sum / students[i].length;
            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + aver);
        }
    }
}

package java_start.ch9;

public class ex1 {
    public static void main(String[] args) {
        analyze(1, 2, 3);
        analyze(15, 25, 35);
    }

    private static void analyze(int ...numbers){
        int sum = 0;
        double  average;

        for (int num : numbers){
            sum += num;
        }
        average = sum / numbers.length;
        System.out.println("평균값: " + average);
    }
}

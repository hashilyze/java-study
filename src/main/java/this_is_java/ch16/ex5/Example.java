package this_is_java.ch16.ex5;

import java.util.Arrays;

public class Example {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    };
    public static double avg(Function<Student> func){
        return Arrays.stream(students).mapToDouble(func::apply).average().getAsDouble();
    }

    public static void main(String[] args) {
        double englishAvg = avg(Student::englishScore);
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg(Student::mathScore);
        System.out.println("수학 평균 점수: " + mathAvg);
    }
}

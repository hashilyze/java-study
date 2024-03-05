package this_is_java.ch7.ex2;

public class Computer extends Calculator {
    @Override
    public double areaCircle(double r){
        System.out.println("Computer 객체의 areaCircle(double r) 실행");
        return Math.PI * r * r;
    }
}

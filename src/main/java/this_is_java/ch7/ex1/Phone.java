package this_is_java.ch7.ex1;

public class Phone {
    public String model;
    public String color;

    public Phone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행");
    }

}

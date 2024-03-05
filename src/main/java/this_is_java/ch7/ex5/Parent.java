package this_is_java.ch7.ex5;

public class Parent {
    String nation;

    public Parent(){
        this("대한민국");
        System.out.println("Parent() call");
    }
    public Parent(String nation){
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}

package this_is_java.ch7.ex3;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();
        ((Child)parent).method3();
    }
}

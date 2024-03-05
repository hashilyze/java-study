package this_is_java.ch7.ex4;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();
    }
}

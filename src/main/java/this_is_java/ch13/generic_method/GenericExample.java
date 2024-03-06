package this_is_java.ch13.generic_method;

public class GenericExample {
    public static void main(String[] args) {
        Box<Integer> box = boxing(100);
        System.out.println(box.getT());
    }

    public static  <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.setT(t);
        return box;
    }
}

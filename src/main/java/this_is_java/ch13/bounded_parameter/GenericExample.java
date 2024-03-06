package this_is_java.ch13.bounded_parameter;

public class GenericExample {
    public static void main(String[] args) {
        System.out.println(compare("123", "45"));
        System.out.println(compare("123", "456"));
    }

    public static <T extends String> boolean compare(T lhs, T rhs){
        return lhs.length() == rhs.length();
    }
}

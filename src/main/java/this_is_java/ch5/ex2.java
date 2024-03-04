package this_is_java.ch5;

public class ex2 {
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = "고길동";

        System.out.println(str1.equals("홍길동"));
        System.out.println(str1.equals("고길동"));

        System.out.println(str1.charAt(1));
        System.out.println(str1.length());
        System.out.println(str1.replace("길동", "누리"));
        System.out.println(str1.substring(1));
        System.out.println(str1.indexOf("길동"));

    }
}
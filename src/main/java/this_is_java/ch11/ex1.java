package this_is_java.ch11;

public class ex1 {
    public static void main(String[] args) {
        printLength(null, 0);
        printLength(null, 1);
        printLength(null, 2);
    }
    public static void printLength(String data, int mode){
        try{
            int result = data.length();
            System.out.println("문자 수: " + result);
        }catch(Exception e){
            switch (mode){
                case 0 -> System.out.println(e.getMessage());
                case 1 -> System.out.println(e.toString());
                case 2 -> e.printStackTrace();
            }
        }finally {
            System.out.println("finally 실행");
        }
    }
}

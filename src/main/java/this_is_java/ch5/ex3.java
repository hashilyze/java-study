package this_is_java.ch5;

public class ex3 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];
        for(int elem : array){
            if(elem > max){
                max = elem;
            }
        }
        System.out.println("최대값: " + max);
    }
}

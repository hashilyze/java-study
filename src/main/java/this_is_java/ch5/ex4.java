package this_is_java.ch5;

public class ex4 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0, count = 0;
        for(int[] subArray : array){
            for (int elem : subArray){
                sum += elem;
            }
            count += subArray.length;
        }
        System.out.println("총 합: " + sum +", 평균: " + count);
    }
}

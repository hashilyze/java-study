package this_is_java.ch15.ex3;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = map.entrySet().stream().max((lhs, rhs) -> lhs.getValue() - rhs.getValue()).get().getKey();;
        int maxScore = map.values().stream().max((lhs, rhs) -> lhs - rhs).get();
        int totalScore = map.values().stream().mapToInt(v->v).sum();
        System.out.println("최댓값: " + name + ": " + maxScore);
        System.out.println("합계: " + totalScore);
    }
}

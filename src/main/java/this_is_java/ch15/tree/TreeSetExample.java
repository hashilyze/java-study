package this_is_java.ch15.tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        scores.forEach((item) -> System.out.println(item.intValue()));
        System.out.println();

        System.out.println("가장 낮은 점수: " + scores.first());
        System.out.println("가장 높은 점수: " + scores.last());
        int criteria = 95;
        System.out.println(criteria + "점 아래 점수: " + scores.lower(criteria));
        System.out.println(criteria + "점 위의 점수: " + scores.higher(criteria));
        System.out.println(criteria + "점 이하 점수: " + scores.floor(criteria));
        System.out.println(criteria + "점 이상 점수: " + scores.ceiling(criteria));
        System.out.println();

        scores.descendingSet()
                .forEach(s -> System.out.println(s + " "));
        System.out.println();

        scores.tailSet(80, true)
                .forEach(s -> System.out.println(s + " "));
        System.out.println();

        scores.subSet(80, true, 90, false)
                .forEach(s -> System.out.println(s + " "));
    }
}

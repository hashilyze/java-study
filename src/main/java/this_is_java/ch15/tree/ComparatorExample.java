package this_is_java.ch15.tree;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if(o1.name().equals(o2.name())){
                    return o1.name().compareTo(o2.name());
                }
                return o1.price() - o2.price();
            }
        });

        treeSet.add(new Fruit("사과", 1000));
        treeSet.add(new Fruit("자몽", 2000));
        treeSet.forEach(item -> System.out.println(item));
    }
}

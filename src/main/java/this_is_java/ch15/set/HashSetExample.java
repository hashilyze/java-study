package this_is_java.ch15.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 20));
        set.add(new Member("홍길동", 30));

        System.out.println("총 객체 수: " + set.size());
        System.out.println();

        Iterator<Member> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        set.remove(new Member("홍길동", 30));
        iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

package this_is_java.ch15.ex2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        
        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(1, "조민우"));

        System.out.println("저장된 객체 수: " + set.size());
        set.forEach((student)-> System.out.println(student.studentNum() + ": " + student.name()));
    }
}

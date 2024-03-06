package this_is_java.ch12.object;

import java.util.HashSet;

public class HashCodeExample {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet();

        Student student1 = new Student(1, "홍길동");
        Student student2 = new Student(1, "홍길동");
        Student student3 = new Student(2, "홍길동");

        System.out.println("저장된 객체 수: " + hashSet.size());
        hashSet.add(student1);
        System.out.println("저장된 객체 수: " + hashSet.size());
        hashSet.add(student2);
        System.out.println("저장된 객체 수: " + hashSet.size());
        hashSet.add(student3);
        System.out.println("저장된 객체 수: " + hashSet.size());
    }
}

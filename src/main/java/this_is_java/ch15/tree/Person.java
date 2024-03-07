package this_is_java.ch15.tree;

public record Person(String name, int age) implements Comparable<Person> {
    @Override
    public int compareTo(Person o) {
        if(this.age == o.age){
            return this.name.compareTo(o.name);
        } else{
            return this.age - o.age;
        }
    }
}

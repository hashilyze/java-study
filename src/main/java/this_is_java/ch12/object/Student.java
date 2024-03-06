package this_is_java.ch12.object;

public class Student {
    private final int no;
    private final String name;

    public Student(int no, String name){
        this.no = no;
        this.name = name;
    }

    public int getNo() { return no; }
    public  String getName() { return name; }

    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student target){
            if(this.no == target.no && this.name.equals(target.name)){
                return true;
            }
        }
        return false;
    }
}

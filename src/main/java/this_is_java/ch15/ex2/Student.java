package this_is_java.ch15.ex2;

public record Student(int studentNum, String name) {
    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student target){
            return this.studentNum == target.studentNum;
        }
        return false;
    }
}

package this_is_java.ch12.object;

public class Member {
    public String id;

    public Member(String id){ this.id = id; }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target){
            return this.id.equals(target.id);
        }
        return false;
    }
}
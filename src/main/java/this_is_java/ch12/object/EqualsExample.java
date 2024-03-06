package this_is_java.ch12.object;

public class EqualsExample {
    public static void main(String[] args) {
        Member member1 = new Member("blue");
        Member member2 = new Member("blue");
        Member member3 = new Member("red");

        System.out.print("member1과 member2는 ");
        printEquals(member1, member2);
        System.out.print("member2과 member3는 ");
        printEquals(member2, member3);
    }

    static void printEquals(Object lhs, Object rhs){
        if(lhs.equals(rhs)){
            System.out.println("동등합니다.");
        } else{
            System.out.println("동등하지 않습니다.");
        }
    }
}

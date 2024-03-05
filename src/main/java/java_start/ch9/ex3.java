package java_start.ch9;

public class ex3 {
    private static int balance = 10000;

    public static void main(String[] args) {
        deposit(1000);
        withdraw(2000);
        System.out.println("최종 잔액: " + balance + "원");
    }

    private static void deposit(int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance);
    }
    private static void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance);
        } else{
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

    }
}

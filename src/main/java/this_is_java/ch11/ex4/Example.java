package this_is_java.ch11.ex4;

public class Example {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        try{
            account.withdraw(30000);
        }catch (InsufficientException e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}

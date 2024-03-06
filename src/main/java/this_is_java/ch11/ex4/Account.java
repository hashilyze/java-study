package this_is_java.ch11.ex4;

public class Account {
    private long balance = 0;

    public Account() { }

    public long getBalance() { return balance; }
    public void deposit(int money){ balance += money; }
    public void withdraw(int money) throws InsufficientException {
        if(balance < money){
            throw new InsufficientException("잔고 부족: " + (money - balance) + " 모자람");
        }
        balance -= money;
    }
}

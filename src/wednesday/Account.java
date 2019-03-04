package wednesday;

public class Account {
    private long balance;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if (balance > 0 && balance < 1000000) {
            this.balance = balance;
        }
    }
}

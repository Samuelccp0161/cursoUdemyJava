package exercise15;

public class Account {
    int number;
    String holder;
    double balance;
    double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > withdrawLimit){
            throw new WithdrawException("The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new WithdrawException("Not enough balance");
        }

        balance -= amount;
    }


}

public class BankAccount {
    double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void printBalance(){
        System.out.println("balance: " + balance);
    }

    public void transfer(double amount, BankAccount bankAccount) {
        this.withdraw(amount);
        bankAccount.deposit(amount);
        System.out.println("transfer is done, amount: " + amount);
    }
}

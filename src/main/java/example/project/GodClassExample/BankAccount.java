package example.project.GodClassExample;

public class BankAccount {

    String owner;
    String accountNumber;
    double balance;
    double interest;

    public BankAccount(String owner, String accountNumber, double balance, double interest) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interest = interest;
    }
    // TODO: move this method to BankAccount class
    public double obtainBalance(BankAccount account) {
        return account.getBalance();
    }
    public double getInterest() {
        return interest;
    }
    // TODO: move this method to BankAccount class
    public void addInterest(BankAccount account) {
        double interest = account.getInterest();
        double value = account.getBalance() * interest;
        account.setBalance(account.getBalance() + value);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Object getAccountNumber() {
        return accountNumber;
    }
}

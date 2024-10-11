package BankingApp;
interface Insurable {
    String getInsuranceDetails();
}

abstract class Transaction {
    protected BankAccount account;

    public Transaction(BankAccount account) {
        this.account = account;
    }

    public abstract void execute();
}

class DepositTransaction extends Transaction {
    private double amount;

    public DepositTransaction(BankAccount account, double amount) {
        super(account);
        this.amount = amount;
    }

    public void execute() {
        account.deposit(amount);
        System.out.println("Deposited: " + amount);
    }
}

class WithdrawalTransaction extends Transaction {
    private double amount;

    public WithdrawalTransaction(BankAccount account, double amount) {
        super(account);
        this.amount = amount;
    }

    public void execute() {
        account.withdraw(amount);
        System.out.println("Withdrew: " + amount);
    }
}

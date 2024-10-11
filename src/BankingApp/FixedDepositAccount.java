package BankingApp;
import java.time.LocalDate;

class FixedDepositAccount extends BankAccount {
    private LocalDate maturityDate;
    private static final double PENALTY_RATE = 0.05;

    public FixedDepositAccount(String accountNumber, LocalDate maturityDate) {
        super(accountNumber);
        this.maturityDate = maturityDate;
    }

    public void withdraw(double amount) {
        if (LocalDate.now().isBefore(maturityDate)) {
            System.out.println("Early withdrawal penalized.");
            balance -= amount + (amount * PENALTY_RATE);
        } else {
            balance -= amount;
        }
    }

    public double calculateInterest() {
        return balance * 0.06;
    }
}

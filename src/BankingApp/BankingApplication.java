package BankingApp;
import java.time.LocalDate;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("SA123");
        BankAccount checkingAccount = new CheckingAccount("CA456", 500.0);
        BankAccount fixedDepositAccount = new FixedDepositAccount("FDA789", LocalDate.now().plusYears(1));

        Transaction depositTransaction = new DepositTransaction(savingsAccount, 1000);
        Transaction withdrawalTransaction = new WithdrawalTransaction(savingsAccount, 200);

        depositTransaction.execute();
        withdrawalTransaction.execute();

        savingsAccount.displayAccountInfo();
        System.out.println("Interest: " + savingsAccount.calculateInterest());

        depositTransaction = new DepositTransaction(checkingAccount, 500);
        withdrawalTransaction = new WithdrawalTransaction(checkingAccount, 600);
        depositTransaction.execute();
        withdrawalTransaction.execute();

        checkingAccount.displayAccountInfo();

        depositTransaction = new DepositTransaction(fixedDepositAccount, 2000);
        withdrawalTransaction = new WithdrawalTransaction(fixedDepositAccount, 500);
        depositTransaction.execute();
        withdrawalTransaction.execute();

        fixedDepositAccount.displayAccountInfo();
        System.out.println("Interest: " + fixedDepositAccount.calculateInterest());
    }
}

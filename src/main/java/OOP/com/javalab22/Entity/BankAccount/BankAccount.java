package OOP.com.javalab22.Entity.BankAccount;
import OOP.com.javalab22.Operations.Print;

/**
 * Класс Банковский Счет
 */
public abstract class BankAccount implements Print {

    private int bankAccountID;
    private long customerID;
    private double amount;
    private BankAccountStatus status;

    public BankAccount(int bankAccountID,
                       long customerID,
                       double amount,
                       BankAccountStatus status) {
        this.bankAccountID = bankAccountID;
        this.customerID = customerID;
        this.amount = amount;
        this.status = status;
    }

    public int getBankAccountID() {
        return this.bankAccountID;
    }

    public long getCustomerID() {
        return customerID;
    }

    public double getAmount() {
        return amount;
    }

    public BankAccountStatus getStatus() {
        return status;
    }

    public void setStatus(BankAccountStatus status) {
        this.status = status;
    }

    public String getType() {
        return null;
    }

    public void print(BankAccount bankAccount) {
        System.out.println("Customer: " + customerID);
        System.out.println("Bank Account Number: " + bankAccountID);
        System.out.println("Status: " + status);
        System.out.println("Amount: " + amount);
        System.out.println("Type: " + bankAccount.getType());
        System.out.println();
    }
}

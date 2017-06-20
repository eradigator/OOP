package OOP.com.javalab22.entity.bankAccount;

/**
 * Класс Банковский Счет
 */
public abstract class BankAccount {

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

}

package OOP.com.javalab22.entity.bankAccount;

/**
 * Created by erad on 18.06.2017.
 */
public class Debet extends BankAccount {
    public Debet(int bankAccountID,
                 long customerID,
                 double amount,
                 BankAccountStatus status) {
        super(bankAccountID, customerID, amount, status);
    }

    @Override
    public String getType() {
        return "Debet";
    }

}

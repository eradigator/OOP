package OOP.com.javalab22.Entity.BankAccount;

import OOP.com.javalab22.Operations.Print;

/**
 * Created by erad on 18.06.2017.
 */
public class Credit extends BankAccount implements Print {

    public Credit(int bankAccountID,
                  long customerID,
                  double amount,
                  BankAccountStatus status) {
        super(bankAccountID, customerID, amount, status);
    }

    @Override
    public String getType() {
        return "Credit";
    }

    @Override
    public void print(BankAccount bankAccount) {
        super.print(bankAccount);
    }

}

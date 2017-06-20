package OOP.com.javalab22.entity.bankAccount;

import OOP.com.javalab22.operations.Print;

/**
 * Created by erad on 18.06.2017.
 */
public class Credit extends BankAccount {

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

}

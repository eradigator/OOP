package OOP.com.javalab22.operations.impl;

import OOP.com.javalab22.entity.Database.Database;
import OOP.com.javalab22.entity.bankAccount.BankAccount;
import OOP.com.javalab22.operations.Search;

/**
 * Created by erad on 20.06.2017.
 */
public class SearchBankAccountByIIN implements Search{

    public Database searchBankAccountByIIN(Database database, long customerID) {
        Database resultDatabase = new Database();
        for (BankAccount bankAccount : database.getDatabase()) {
            if(bankAccount.getCustomerID()== customerID) {
                resultDatabase.getDatabase().add(bankAccount);
            }
        }
        return resultDatabase;
    }

}

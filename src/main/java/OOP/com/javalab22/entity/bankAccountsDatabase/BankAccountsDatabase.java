package OOP.com.javalab22.entity.bankAccountsDatabase;

import OOP.com.javalab22.entity.bankAccount.BankAccount;

import java.util.ArrayList;

/**
 * Created by erad on 19.06.2017.
 */
public class BankAccountsDatabase {
    private ArrayList<BankAccount> bankAccountsDatabase = new ArrayList<BankAccount>();

    public ArrayList<BankAccount> getBankAccountsDatabase() {
        return bankAccountsDatabase;
    }

}

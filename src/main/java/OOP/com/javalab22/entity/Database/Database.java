package OOP.com.javalab22.entity.Database;

import OOP.com.javalab22.entity.bankAccount.BankAccount;

import java.util.ArrayList;

/**
 * Created by erad on 19.06.2017.
 */
public class Database {
    private ArrayList<BankAccount> database = new ArrayList<BankAccount>();

    public ArrayList<BankAccount> getDatabase() {
        return database;
    }

}

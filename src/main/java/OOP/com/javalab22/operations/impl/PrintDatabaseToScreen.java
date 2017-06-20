package OOP.com.javalab22.operations.impl;

import OOP.com.javalab22.entity.bankAccount.BankAccount;
import OOP.com.javalab22.entity.Database.Database;
import OOP.com.javalab22.operations.PrintDatabase;

/**
 * Created by erad on 20.06.2017.
 */
public class PrintDatabaseToScreen implements PrintDatabase {
    public void print(Database database) {

        for (BankAccount x : database.getDatabase()) {
            System.out.println(x.toString());
        }
        System.out.println();
    }
}

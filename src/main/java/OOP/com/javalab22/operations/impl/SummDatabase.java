package OOP.com.javalab22.operations.impl;

import OOP.com.javalab22.entity.Database.Database;
import OOP.com.javalab22.entity.bankAccount.BankAccount;
import OOP.com.javalab22.operations.Summ;

/**
 * Created by erad on 20.06.2017.
 */
public class SummDatabase implements Summ {
    public double summ(Database database) {
        double result = 0;
        for (BankAccount bankAccount : database.getDatabase()) {
            result += bankAccount.getAmount();
        }
        return result;
    }

    public double summPositive(Database database) {
        double result = 0;
        for (BankAccount bankAccount : database.getDatabase()) {
            if (bankAccount.getAmount() > 0) result += bankAccount.getAmount();
        }
        return result;
    }

    public double summNegative(Database database) {
        double result = 0;
        for (BankAccount bankAccount : database.getDatabase()) {
            if (bankAccount.getAmount() < 0) result += bankAccount.getAmount();
        }
        return result;
    }


}

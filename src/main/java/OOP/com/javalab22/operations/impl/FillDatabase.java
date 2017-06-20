package OOP.com.javalab22.operations.impl;

import OOP.com.javalab22.entity.bankAccount.BankAccountStatus;
import OOP.com.javalab22.entity.bankAccount.Credit;
import OOP.com.javalab22.entity.bankAccount.Debet;
import OOP.com.javalab22.entity.Database.Database;
import OOP.com.javalab22.operations.Fill;


/**
 * Created by erad on 19.06.2017.
 */
public class FillDatabase implements Fill {

    public Database fillDatabase(Database database) {

        database.getDatabase().add(new Credit(1000, 851126350040L, 995.7, BankAccountStatus.Active, 5000));
        database.getDatabase().add(new Debet(1001, 851126350030L, -9144, BankAccountStatus.Closed));
        database.getDatabase().add(new Credit(1002, 851123523550L, 135135, BankAccountStatus.Active, 6777));
        database.getDatabase().add(new Debet(1003, 851126350040L, 944, BankAccountStatus.Active));
        database.getDatabase().add(new Credit(1004, 851126350040L, -23234, BankAccountStatus.Active, 24626));
        database.getDatabase().add(new Debet(1005, 851346463460L, 124214, BankAccountStatus.Paused));
        database.getDatabase().add(new Credit(1006, 852342343243L, -9939, BankAccountStatus.Active, 46346));

        return database;
    }
}

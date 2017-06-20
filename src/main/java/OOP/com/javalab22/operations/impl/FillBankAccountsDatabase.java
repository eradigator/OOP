package OOP.com.javalab22.operations.impl;

import OOP.com.javalab22.entity.bankAccount.BankAccountStatus;
import OOP.com.javalab22.entity.bankAccount.Credit;
import OOP.com.javalab22.entity.bankAccount.Debet;
import OOP.com.javalab22.entity.bankAccountsDatabase.BankAccountsDatabase;
import OOP.com.javalab22.operations.Fill;


/**
 * Created by erad on 19.06.2017.
 */
public class FillBankAccountsDatabase implements Fill {

    public BankAccountsDatabase fillBankAccountsDatabase(BankAccountsDatabase bankAccountsDatabase) {

        bankAccountsDatabase.getBankAccountsDatabase().add(new Credit(1000, 851126350040L, 995.7, BankAccountStatus.Active));
        bankAccountsDatabase.getBankAccountsDatabase().add(new Debet(1001, 851126350030L, -91444, BankAccountStatus.Active));
        bankAccountsDatabase.getBankAccountsDatabase().add(new Credit(1002, 851123523550L, 135135, BankAccountStatus.Active));
        bankAccountsDatabase.getBankAccountsDatabase().add(new Debet(1003, 851246246240L, 944, BankAccountStatus.Active));
        bankAccountsDatabase.getBankAccountsDatabase().add(new Credit(1004, 851122345620L, -234234, BankAccountStatus.Active));
        bankAccountsDatabase.getBankAccountsDatabase().add(new Debet(1005, 851346463460L, 124214, BankAccountStatus.Active));
        bankAccountsDatabase.getBankAccountsDatabase().add(new Credit(1006, 852342343243L, -9939, BankAccountStatus.Active));

        return bankAccountsDatabase;
    }
}

package OOP.com.javalab22.runner;

import OOP.com.javalab22.entity.bankAccount.BankAccount;
import OOP.com.javalab22.entity.bankAccountsDatabase.BankAccountsDatabase;
import OOP.com.javalab22.operations.impl.FillBankAccountsDatabase;
import OOP.com.javalab22.operations.impl.PrintBankAccount;


/**
 * Created by Тен В.
 * Счета.
 * Клиент может иметь несколько счетов в банке.
 * Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов.
 * Вычисление суммы по всем счетам.
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class App {
    public static void main(String[] args) {

        BankAccountsDatabase bankAccountsDatabase = new BankAccountsDatabase();
        FillBankAccountsDatabase fill = new FillBankAccountsDatabase();
        fill.fillBankAccountsDatabase(bankAccountsDatabase);

        PrintBankAccount out = new PrintBankAccount();
        for (BankAccount x: bankAccountsDatabase.getBankAccountsDatabase()) {
            out.print(x);
        }
    }


}

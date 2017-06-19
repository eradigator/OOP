package OOP.com.javalab22.Runner;

import OOP.com.javalab22.Entity.BankAccount.BankAccount;
import OOP.com.javalab22.Entity.BankAccount.BankAccountStatus;
import OOP.com.javalab22.Entity.BankAccount.Credit;
import OOP.com.javalab22.Entity.BankAccount.Debet;

import java.util.ArrayList;

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

        //создание ArrayList банковских счетов
        ArrayList<BankAccount> allAccounts = new ArrayList<BankAccount>();
        allAccounts.add(new Credit(1000,851126350040L, 995.7, BankAccountStatus.Active));
        allAccounts.add(new Debet(1001,851126350030L, -91444, BankAccountStatus.Active));
        allAccounts.add(new Credit(1002,851123523550L, 135135, BankAccountStatus.Active));
        allAccounts.add(new Debet(1003,851246246240L, 944, BankAccountStatus.Active));
        allAccounts.add(new Credit(1004,851122345620L, -234234, BankAccountStatus.Active));
        allAccounts.add(new Debet(1005,851346463460L, 124214, BankAccountStatus.Active));
        allAccounts.add(new Credit(1006,852342343243L, -9939, BankAccountStatus.Active));

        for (BankAccount x: allAccounts) {
            x.print(x);
        }
    }


}

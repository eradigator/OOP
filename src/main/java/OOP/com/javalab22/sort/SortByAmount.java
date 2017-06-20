package OOP.com.javalab22.sort;

import OOP.com.javalab22.entity.bankAccount.BankAccount;

import java.util.Comparator;

/**
 * Created by erad on 20.06.2017.
 */
public class SortByAmount implements Comparator<BankAccount> {
    public int compare(BankAccount o1, BankAccount o2) {
        double o1amount = o1.getAmount();
        double o2amount = o2.getAmount();
        if (o1amount > o2amount) {
            return 1;
        } else if (o1amount < o2amount) {
            return -1;
        } else {
            return 0;
        }
    }
}

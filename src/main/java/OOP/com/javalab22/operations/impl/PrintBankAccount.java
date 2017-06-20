package OOP.com.javalab22.operations.impl;

import OOP.com.javalab22.entity.bankAccount.BankAccount;
import OOP.com.javalab22.operations.Print;

/**
 * Created by erad on 19.06.2017.
 */
public class PrintBankAccount implements Print {
    public void print(BankAccount bankAccount) {
        System.out.println("Customer: " + bankAccount.getCustomerID());
        System.out.println("Bank Account Number: " + bankAccount.getBankAccountID());
        System.out.println("Status: " + bankAccount.getStatus());
        System.out.println("Amount: " + bankAccount.getAmount());
        System.out.println("Type: " + bankAccount.getType());
        System.out.println();
    }
}

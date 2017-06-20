package OOP.com.javalab22.operations;

import OOP.com.javalab22.entity.Database.Database;

/**
 * Created by erad on 18.06.2017.
 */
public interface Search {
    Database searchBankAccountByIIN(Database database, long customerID);
}

package OOP.com.javalab22.operations;

import OOP.com.javalab22.entity.Database.Database;

/**
 * Created by erad on 20.06.2017.
 */
public interface Summ {
    double summ(Database database);

    double summPositive (Database database);

    double summNegative (Database database);

}

package OOP.com.javalab22.runner;

import OOP.com.javalab22.entity.Database.Database;
import OOP.com.javalab22.operations.impl.FillDatabase;
import OOP.com.javalab22.operations.impl.PrintDatabaseToScreen;
import OOP.com.javalab22.operations.impl.SearchBankAccountByIIN;
import OOP.com.javalab22.operations.impl.SummDatabase;
import OOP.com.javalab22.sort.SortByAmount;
import java.util.Collections;


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

        Database database = new Database();

        FillDatabase fill = new FillDatabase();
        fill.fillDatabase(database);

        System.out.println("Все счета:");
        PrintDatabaseToScreen printDatabaseToScreen = new PrintDatabaseToScreen();
        printDatabaseToScreen.print(database);

        System.out.println("Поиск по ИИН");
        SearchBankAccountByIIN search = new SearchBankAccountByIIN();
        printDatabaseToScreen.print(search.searchBankAccountByIIN(database,851126350040L));

        System.out.println("Сумма по всем счетам");
        SummDatabase summ = new SummDatabase();
        System.out.println(summ.summ(database));

        System.out.println("Сумма по всем положительным счетам");
        System.out.println(summ.summPositive(database));

        System.out.println("Сумма по всем отрицательным счетам");
        System.out.println(summ.summNegative(database));

        System.out.println();

        System.out.println("Сортировка по сумме на счету");
        Collections.sort (database.getDatabase(),new SortByAmount());
        printDatabaseToScreen.print(database);
    }
}

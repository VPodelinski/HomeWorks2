package by.Vitali.HomeWorks.WB3EX4EX5.SQLquery.WB3EX7;

import by.Vitali.HomeWorks.WB3EX4EX5.SQLquery.WB3EX7.Beans.Expense;
import by.Vitali.HomeWorks.WB3EX4EX5.SQLquery.WB3EX7.Beans.Receiver;


import java.util.List;

/**
 * Created by Виталий on 22.08.2017.
 */
public interface DAO {
    Receiver getReceiver(int num);
    List<Receiver> getReceivers();
    Expense getExpense(int num);
    List<Expense> getExpenses();
    int addReceiver(Receiver receiver);
    int addExpense(Expense expense);
}

package by.Vitali.HomeWorks.WB3EX15;

import by.Vitali.HomeWorks.WB3EX15.Beans.Expense;
import by.Vitali.HomeWorks.WB3EX15.Beans.Receiver;

import java.util.List;

/**
 * Created by viivpo2010 on 28.8.17.
 */
public interface DAO {

    Receiver getReceiver(int num);
    List<Receiver> getReceivers();
    Expense getExpense(int num);
    List<Expense> getExpenses();
    int addReceiver(Receiver receiver);
    int addExpense(Expense expense);

}

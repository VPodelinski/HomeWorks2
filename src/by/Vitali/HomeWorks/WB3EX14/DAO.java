package by.Vitali.HomeWorks.WB3EX14;

import by.Vitali.HomeWorks.WB3EX14.Beans.Expense;
import by.Vitali.HomeWorks.WB3EX14.Beans.Receiver;

import java.util.List;

/**
 * Created by viivpo2010 on 26.8.17.
 */
public interface DAO {

    Receiver getReceiver(int num);
    List<Receiver> getReceivers();
    Expense getExpense(int num);
    List<Expense> getExpenses();
    int addReceiver(Receiver receiver);
    int addExpense(Expense expense);

}

package by.Vitali.HomeWorks.WB3EX4EX5.SQLquery.WB3EX7;

import by.Vitali.HomeWorks.WB3EX4EX5.SQLquery.WB3EX7.Beans.Expense;
import by.Vitali.HomeWorks.WB3EX4EX5.SQLquery.WB3EX7.Beans.Receiver;

import java.util.List;

/**
 * Created by Виталий on 22.08.2017.
 */
public class Application {
    public static void main(String[] args) {
        DAOClass daoClass = DAOClass.getDAOClass();

        // daoClass.addReceiver(new Receiver(6, "LIFE"));
        // daoClass.addExpense(new Expense(20, "2017-08-22", 6, 1070));

        Receiver receiver = daoClass.getReceiver(5);
        System.out.println(receiver.getNum() + " " + receiver.getName());
        receiver = daoClass.getReceiver(1);
        System.out.println(receiver.getNum() + " " + receiver.getName());

        Expense expense = daoClass.getExpense(5);
        System.out.println(expense.getNum() + " " + expense.getPayDate() + " " + expense.getReceiver() + " " + expense.getValue());
        expense = daoClass.getExpense(1);
        System.out.println(expense.getNum() + " " + expense.getPayDate() + " " + expense.getReceiver() + " " + expense.getValue());

        System.out.println("Table expenses");
        List<Expense> expenses = daoClass.getExpenses();
        for (Expense exp : expenses) {
            System.out.println(exp.getNum() + " " + exp.getPayDate() + " " + exp.getReceiver() + " " + exp.getValue());
        }

        System.out.println("Table receivers:");
        List<Receiver> receiverList = daoClass.getReceivers();
        for (Receiver receiver2 : receiverList) {
            System.out.println(receiver2.getNum() + " " + receiver2.getName());
        }

    }
}

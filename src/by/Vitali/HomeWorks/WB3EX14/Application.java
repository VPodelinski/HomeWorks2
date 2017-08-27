package by.Vitali.HomeWorks.WB3EX14;

import by.Vitali.HomeWorks.WB3EX14.Beans.Expense;
import by.Vitali.HomeWorks.WB3EX14.Beans.Receiver;

import java.util.List;

/**
 * Created by viivpo2010 on 27.8.17.
 */
public class Application {
    public static void main(String[] args) {
        DAOClass daoClass = DAOClass.getDAOClass();

        // daoClass.addReceiver(new Receiver(6, "LIFE"));
        // daoClass.addExpense(new Expense(20, "2017-08-22", 6, 1070));
//        daoClass.setUser("root");
//        daoClass.setPassword("1234");
        daoClass.setUrl("jdbc:mysql://localhost:3306/MYDB");
        daoClass.setConn("root","1234");

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


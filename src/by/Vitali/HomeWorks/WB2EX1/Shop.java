package by.Vitali.HomeWorks.WB2EX1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by viivpo2010 on 17.8.17.
 */
public class Shop {
    private ExecutorService cashBox;
    private int cashBoxCount;

    public int getCashBoxCount() {
        System.out.println("There are  " + cashBoxCount + " cashboxes in the shop");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return cashBoxCount;
    }

    public Shop(final int cashBoxCount) {
        cashBox = Executors.newFixedThreadPool(cashBoxCount);
        this.cashBoxCount = cashBoxCount;
    }
    public void sendCustomer(Customers customers ){
        cashBox.submit(customers);

    }

    public void close(){
        cashBox.shutdown();
    }
}

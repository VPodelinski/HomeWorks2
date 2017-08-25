package by.Vitali.HomeWorks.WB2EX1;

import java.util.List;


/**
 * Created by viivpo2010 on 17.8.17.
 */
public class Customers implements Runnable {
    private int idCustomer;
    private List<String> products;

    public Customers(int idCustomer, List<String> products) {
        this.idCustomer = idCustomer;
        this.products = products;
    }

    @Override
    public void run() {
        System.out.println("Customer №" + idCustomer + " enter in cashbox!");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        buy(products);
    }

    public void buy(final List<String> list) {

        for (String product : list) {
            System.out.println("Customer №" + idCustomer + " buy " + product + ",");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("   Customer №"+ idCustomer +" bought  " + list.size() + " iteams and leave shop");
    }
}

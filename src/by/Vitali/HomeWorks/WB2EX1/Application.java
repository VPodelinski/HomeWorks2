package by.Vitali.HomeWorks.WB2EX1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * WB2 EX1 Cashboxes and customers!
 */
public class Application {
    public static void main(final String... args) {
        Shop shop = new Shop(4);
        Product product = new Product();
        Random random = new Random();
        shop.getCashBoxCount();

        for( int i = 1 ; i <= 10; i++){
            shop.sendCustomer(new Customers(i, product.giveProduct(random.nextInt(10)))) ;
        }
        shop.close();
    }
}

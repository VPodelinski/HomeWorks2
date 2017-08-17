package by.Vitali.HomeWorks.WB2EX1;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by viivpo2010 on 17.8.17.
 */
public class Product {

    private static final List<String> productsMap = new ArrayList<>();
    static {
        productsMap.add("milk");
        productsMap.add("bread");
        productsMap.add("bear");
        productsMap.add("water");
        productsMap.add("sugar");
        productsMap.add("cognac");
        productsMap.add("cigarette");
        productsMap.add("butter");
        productsMap.add("candy");
        productsMap.add("wine");

    }

    public List<String> giveProduct(final int number){
        List<String> list = new ArrayList<>();

        for(int i = number; i < productsMap.size(); i++){
            list.add(productsMap.get(i));
        }
        return list;
    }
}

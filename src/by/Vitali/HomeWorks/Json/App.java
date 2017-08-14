package by.Vitali.HomeWorks.Json;

import by.Vitali.HomeWorks.Json.modelATM.*;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * JSON
 */
public class App {
    public static void main(String[] args) throws IOException {

        // object card1
        Owner owner = new Owner();
        owner.setFirstName("Vitali");
        owner.setLastName("Podelinski");

        Bank bank = new Bank();
        bank.setName("BPS-Bank");

        Account account = new Account();
        account.setSumOfMoney("800000");

        Card card1 = new Card();
        card1.setNumber("1111 1111 1111 1111");
        card1.setAccount(account);
        card1.setBank(bank);
        card1.setOwner(owner);
        card1.setPin("1233");


        // object card2
        Owner owner2 = new Owner();
        owner2.setFirstName("Ivan");
        owner2.setLastName("Ivanov");

        Bank bank2 = new Bank();
        bank2.setName("Belarus");

        Account account2 = new Account();
        account2.setSumOfMoney("10000000");

        Card card2 = new Card();
        card2.setNumber("1111 1771 1111 2222");
        card2.setAccount(account2);
        card2.setBank(bank2);
        card2.setOwner(owner2);
        card2.setPin("1433");

        // object Atm
        Cash cash = new Cash();
        cash.setCash5(5);
        cash.setCash10(10);
        cash.setCash20(20);
        cash.setCash50(50);
        cash.setCash100(100);

        ATM atm = new ATM();
        atm.setBank(bank);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(cash.getCash5(),10);
        map.put(cash.getCash10(), 10);
        map.put(cash.getCash20(), 10);
        map.put(cash.getCash50(), 10);
        map.put(cash.getCash100(), 10);

        atm.setMapCash(map);

        ObjectMapper objectMapper = new ObjectMapper();

        // записываю объекты в json
        objectMapper.writeValue(new File("/home/viivpo2010/IT ACADEMY/ITAcademyHW/src/by/Vitali/HomeWorks/Json/resources/outputCard1.json"), card1);
        objectMapper.writeValue(new File("/home/viivpo2010/IT ACADEMY/ITAcademyHW/src/by/Vitali/HomeWorks/Json/resources/outputCard2.json"), card2);
        objectMapper.writeValue(new File("/home/viivpo2010/IT ACADEMY/ITAcademyHW/src/by/Vitali/HomeWorks/Json/resources/outputATM.json"), atm);

        //считываю с JSON
        Card myCard1 = objectMapper.readValue(new File("/home/viivpo2010/IT ACADEMY/ITAcademyHW/src/by/Vitali/HomeWorks/Json/resources/outputCard1.json"), Card.class);
        Card myCard2 = objectMapper.readValue(new File("/home/viivpo2010/IT ACADEMY/ITAcademyHW/src/by/Vitali/HomeWorks/Json/resources/outputCard2.json"), Card.class);
        ATM myATM = objectMapper.readValue(new File("/home/viivpo2010/IT ACADEMY/ITAcademyHW/src/by/Vitali/HomeWorks/Json/resources/outputATM.json"), ATM.class);

        //сравниваю с исходным объектом
        System.out.println(" исходная карта1 идентична прочитаной c JSON картой1 ? " + myCard1.equals(card1));
        System.out.println(" исходная карта2 идентична прочитаной c JSON? картой2 ? " + myCard2.equals(card2));
        System.out.println(" исходная карта1 идентична прочитаной c JSON? картой2 ? " + myCard1.equals(card2));
        System.out.println(" исходная карта2 идентична прочитаной c JSON? картой1 ? " + myCard1.equals(card2));
        System.out.println(" исходный банкомат идентичен прочитанному JSON ? " +myATM.equals(atm));
    }
}

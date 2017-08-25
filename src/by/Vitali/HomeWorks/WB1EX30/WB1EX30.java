package by.Vitali.HomeWorks.WB1EX30;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * WB1 EX30
 */
public class WB1EX30 {

    public static void main(final String... args) {
        String s;
        int before;
        int after;
        int sum = 0; //counter punctuation
        int countWords = 0; //counter words
        if (args.length == 0){
            System.out.println("Exception!!! not arguments!!! ");
            return;
        }
        else {
            try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));) {
                while ((s = reader.readLine()) != null) {
                    System.out.println(s);
                    before = s.length();
                    after = s.replaceAll("[,.!?]", "").length();
                    sum = sum + (before - after);
                    countWords = countWords + s.split(" ").length;
                }
                System.out.println("\nКоличество знаков препинания в тексте: " + (sum));
                System.out.println("Количество слов в тексте: " + countWords);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package problems;

import java.util.*;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

       // String text;
        List<String> list = Arrays.asList(st.split(" "));

        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            if(Collections.frequency(list, word)>1) // To check Duplicate - Means More then one

            {
                System.out.println(word + ": " + Collections.frequency(list, word));
            }


        }

       int totalLenght = 0;
        int i =0;
        for(Object word:list){
            totalLenght = totalLenght+word.toString().length();
            //System.out.println(word);
            i++;
        }


        System.out.println("Average length of the words "+totalLenght/i);
       // System.out.println(i);
    }

}

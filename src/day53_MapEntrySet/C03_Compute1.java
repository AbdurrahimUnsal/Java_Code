package day53_MapEntrySet;

import java.util.Map;
import java.util.TreeMap;

public class C03_Compute1 {
    public static void main(String[] args) {




        String[] arr = {"A","C","B","N","A","N","A"};
        Map<String,Integer> usageOfLetters = new TreeMap<>();

        for (String eachLetter : arr){
            if (!usageOfLetters.containsKey(eachLetter)){
                usageOfLetters.put(eachLetter,1);
            }else {
                int oldValue = usageOfLetters.get(eachLetter);
                usageOfLetters.put(eachLetter,oldValue+1);

            }
        }
    }
}

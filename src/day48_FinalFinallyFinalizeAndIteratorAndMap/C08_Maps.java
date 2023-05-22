package day48_FinalFinallyFinalizeAndIteratorAndMap;
import java.util.HashMap;
import java.util.Map;
public class C08_Maps {
    public static void main(String[] args) {

        //Creating a map object
        Map<String, Integer> mapObject = new HashMap<>();

        //putting elements in map
        //element are listed as "key = value" relationship

        mapObject.put("John", 40);
        mapObject.put("Mike", 30);
        mapObject.put("Emily", 35);
        mapObject.put("Sue", 55);


        System.out.println(mapObject);
    }
}

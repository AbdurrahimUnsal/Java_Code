package javaCodingPractice;
import java.util.*;
public class C27 {
    /*
   Below is a map with product names as keys and number of products as value.
are available. Print the product names in alphabetical order.
Map<String, Integer> product = new HashMap<>();
product.put("Laptop", 82);
product.put("TV", 53);
product.put("Refrigerator", 12);
product.put("Music System", 87);
product.put("Mobile Phone", 53);
     */
    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        List<String> sortedProductNames = new ArrayList<>(product.keySet());
        Collections.sort(sortedProductNames);

        for (String productName : sortedProductNames) {
            System.out.println(productName);
        }
    }

}


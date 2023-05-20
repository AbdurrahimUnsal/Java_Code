package day28_MDAandList;
import java.util.ArrayList;
import java.util.List;
public class C05_remove {
    public static void main(String[] args) {

        List<String> letters = new ArrayList<>();

        System.out.println(letters.isEmpty());//true

        letters.add("A");
        letters.add("B");
        letters.add("K");

        System.out.println(letters.isEmpty());//false
        System.out.println(letters); //[A, B, K]

        System.out.println(letters.remove("B"));//true //you can remove the object
        System.out.println(letters); //[A, K]

        System.out.println(letters.remove(0));//A //you can remove the object on a specific index
        System.out.println(letters);//[K]

        List<Integer> listOfNumbers = new ArrayList<>();

        listOfNumbers.add(1);
        listOfNumbers.add(10);
        listOfNumbers.add(100);
        System.out.println(listOfNumbers);//[1, 10, 100]

        listOfNumbers.remove(1);
        System.out.println(listOfNumbers);//[1, 100]

        //how can I remove numbers as an object

        //int removeObject = 100; //int is a primitive data type that' why it is not excepted as list object
        Integer removeObject = 100; //use wrapper class for the data type of number
        listOfNumbers.remove(removeObject);
        System.out.println(listOfNumbers);//[1]





    }
}

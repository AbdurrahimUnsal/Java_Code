package day29_ArrayList2;
import java.util.ArrayList;
import java.util.List;
public class C01_Sublist {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();//[]

        // numbers.add("3"); Java will complain because data type is Integer

        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(13);
        numbers.add(53);
        numbers.add(2);

        System.out.println(numbers);//[3, 5, 2, 13, 53, 2]

        System.out.println(numbers.subList(2, 5));//[2, 13, 53]

        //sublist() method does not change the last form original list

        System.out.println(numbers);//[3, 5, 2, 13, 53, 2]


    }
}

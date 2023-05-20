package day29_ArrayList2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class C03_Equals {
    public static void main(String[] args) {

        //Equals() method checks the index by index if the values are same

        //Collections grandparent class could be used if both list has the same elements

        List<Integer>  numbers1 = new ArrayList<>(); //[]
        numbers1.add(3);
        numbers1.add(8);
        numbers1.add(1);
        numbers1.add(2);

        System.out.println(numbers1);//[3, 8, 1, 2]

        List<Integer>  numbers2 = new ArrayList<>(); //[]
        numbers2.add(3);
        numbers2.add(8);
        numbers2.add(1);
        numbers2.add(2);

        System.out.println(numbers2);//[3, 8, 1, 2]

        System.out.println(numbers1.equals(numbers2));//true

        numbers2.set(1,1);
        numbers2.set(2,8);
        System.out.println(numbers2);//[3, 1, 8, 2]

        System.out.println(numbers1.equals(numbers2));//false


        //checking if both list consist of same elements
        Collections.sort(numbers2);
        System.out.println(numbers2);//[1, 2, 3, 8]

        Collections.sort(numbers1);
        System.out.println(numbers1);//[1, 2, 3, 8]

        System.out.println(numbers1.equals(numbers2));//[1, 2, 3, 8]


    }

}

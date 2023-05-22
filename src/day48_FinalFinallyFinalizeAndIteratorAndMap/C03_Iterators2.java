package day48_FinalFinallyFinalizeAndIteratorAndMap;

import java.util.ArrayList;
import java.util.List;

public class C03_Iterators2 {
    public static void main(String[] args) {

            /*

        Some data types in Java does not support index structure so we can not use fori loops for all datatypes

        If we want to print elements of a datatype which does not support index, we can use for each loop
        but we can not update elements with foreach or fori loops

        When we want to delete all elements of a list, It is not possible by using loops

        so to solve these probles we use ITERATORS


         */

        List<Integer> numbers = new ArrayList<>();//[]

        numbers.add(6);
        numbers.add(56);
        numbers.add(3);
        numbers.add(4);


        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            numbers.remove(i);

        }

//        for (int each: numbers
//             ) {
//            numbers.remove(each);
//        }                                we are going to get IndexOutOfBoundsException

        System.out.println(numbers);

    }
}

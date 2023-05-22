package day48_FinalFinallyFinalizeAndIteratorAndMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterators3 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();//[]

        numbers.add(6);
        numbers.add(56);
        numbers.add(3);
        numbers.add(4);

        //first we need to create iterator object
        Iterator it1 = numbers.iterator();


        System.out.println(it1.hasNext());//true iterator takes its place just before the first element
        System.out.println(it1.next());//6 //first element of the list

        System.out.println(it1.hasNext());//true
        System.out.println(it1.next());//56

        System.out.println(it1.hasNext());//true
        System.out.println(it1.next());//3

        System.out.println(it1.hasNext());//true
        System.out.println(it1.next());//4

//        System.out.println(it1.hasNext());//false
        System.out.println(it1.next());//NoSuchElementException

    }
}

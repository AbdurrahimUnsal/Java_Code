package day48_FinalFinallyFinalizeAndIteratorAndMap;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C06_Iterator5 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(56);
        numbers.add(3);
        numbers.add(4);

        // add 3 to each element using iterator

        ListIterator lit = numbers.listIterator();

//        while (lit.hasNext()){
//           Integer number = (Integer) lit.next();
//           lit.set(number+3);
//        }
//
//        System.out.println(numbers);

        System.out.println("===========");

        // print all elements starting from the end of the list

        while(lit.hasNext()){
            lit.next();
        }

        while (lit.hasPrevious()){   //Before using hasPrevious(), previous() methods you need to move in the list with next()
            System.out.print(lit.previous()+ " ");
        }

    }
}

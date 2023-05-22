package day48_FinalFinallyFinalizeAndIteratorAndMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class C05_Iterators4 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(56);
        numbers.add(3);
        numbers.add(4);

        //Let's delete all elements using iterators

        Iterator itr1 = numbers.iterator();

//        int sizeOfList = numbers.size();
//
//        for (int i = 0; i < sizeOfList; i++) {
//            itr1.next();
//            itr1.remove();
//        }
//
//        System.out.println(numbers);//[]

        //2.Way
        while (itr1.hasNext()){
            itr1.next();
            itr1.remove();
        }

        System.out.println(numbers);//[]

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(2);
        numbers2.add(4);
        numbers2.add(6);
        numbers2.add(8);

        Iterator itr2 = numbers2.iterator();

        //remove all element for second object

        while (itr2.hasNext()){
            itr2.next();
            itr2.remove();
        }

        System.out.println(numbers2);//[]

    }
}

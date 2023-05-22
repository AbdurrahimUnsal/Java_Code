package day48_FinalFinallyFinalizeAndIteratorAndMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class C07_IteratorQuestion1 {
     /*
  Question 1) Write a program that deletes elements in a list that are not in the desired number range ...
  (operate on the current list without creating the 2nd list)
Example : [2,13,56,23,45,14,40] desired range is between 20 and 40 (including borders)
output: [23,40]

   */

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(13);
        numbers.add(56);
        numbers.add(23);
        numbers.add(45);
        numbers.add(14);
        numbers.add(40);

        Iterator itr = numbers.iterator();

        while (itr.hasNext()){
            int num = (Integer) itr.next();
            if(num<=40 && num>=20){
                //no need to do anything for the numbers between 20 and 40
            }else {
                itr.remove();
            }
        }

        System.out.println(numbers);//[23, 40]

        //HW: Create a method for this operation listOrginazer(List, minValue, maxValue)

    }
}




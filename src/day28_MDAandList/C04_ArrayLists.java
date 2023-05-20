package day28_MDAandList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C04_ArrayLists {
    public static void main(String[] args) {

        /*
         */
        int[] arr= {1,2};
        System.out.println(Arrays.toString(arr));

         /*
        When we create a list we do not need to fix the length
        But we need to add elements one by one
         */

        // to add a new element by using the method
        // we used the method, it returned the new array, to change old array, we need to make assignment



        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<>();

        //list doesn't except primitive data types
        // List<int> list3 = new ArrayList<>();



        list.add(12);
        list.add(15);
        list.add(18);
        list.add(21);

        System.out.println(list);

        //add elements to list 2
        list2.add(1);
        list2.add(2);
        list2.add(3);

        list.addAll(list2);

        System.out.println(list);//[12, 15, 18, 21, 1, 2, 3]

        list.add(1, 230);
        System.out.println(list);//[12, 230, 15, 18, 21, 1, 2, 3]

        list.addAll(0, list2);
        System.out.println(list); //[1, 2, 3, 12, 230, 15, 18, 21, 1, 2, 3]
    }

}

package day29_ArrayList2;
import java.util.ArrayList;
import java.util.List;
public class C02_Contains {
    public static void main(String[] args) {
        // get rid of repeated numbers from an array

        int [] arr = {3,4,5,6,3,4,5,6,5,4,3,4,5,6,5,6,5,4,3,4,5,6,5,4,5,6,3,4,5,6,5};

        List<Integer> uniqueList = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(!uniqueList.contains(arr[i])){
                uniqueList.add(arr[i]);
            }
        }

        System.out.println(uniqueList);//[3, 4, 5, 6]

        System.out.println(uniqueList.size());//4
        System.out.println(arr.length);//31

        boolean bl = uniqueList.contains(7);//false
        System.out.println(bl);

        System.out.println(uniqueList.contains(7));//false
        System.out.println(uniqueList.contains(5));//true


    }
}

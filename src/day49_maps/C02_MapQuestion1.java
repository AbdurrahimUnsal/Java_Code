package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_MapQuestion1 {

      /*
        Question: Print the names and surnames of the students in the H branch as a list.
         */

    public static void main(String[] args) {
        Map<Integer,String> schoolMap = new HashMap<>();

        schoolMap.put(101,"Ali-Cem-10-H");//  [Ali, Cem, 10, H]
        schoolMap.put(102,"Veli-Can-10-M");
        schoolMap.put(103,"Ali-Can-11-M");
        schoolMap.put(104,"Ayse-Cem-11-H");
        schoolMap.put(105,"Ayse-Han-10-H");
        schoolMap.put(106,"Veli-Han-10-H");

        for(String each: schoolMap.values()){
            String[] arr = each.split("-");
            if(arr[3].equalsIgnoreCase("h")){
                System.out.println("name: " + arr[0] + ", surname: "+ arr[1]);
            }
        }

        System.out.println("**********************************************");
        // create a method to do calculation
        // to use a method we should send the data
        // first data is the map we will be working on
        // second data is the branch
        // method will print names and surnames of these students  ( void )

        MapsMethods.namesOfStudentsFromBranch(schoolMap, "h");

        System.out.println("**********************************************");
        MapsMethods.namesOfStudentsFromBranch(schoolMap, "m");




    }

}
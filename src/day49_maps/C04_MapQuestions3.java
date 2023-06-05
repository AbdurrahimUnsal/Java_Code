package day49_maps;

import java.util.Map;

public class C04_MapQuestions3 {

    public static void main(String[] args) {


        Map<Integer,String> schoolMap= MapsMethods.createExampleMap();
        System.out.println(schoolMap);
        //{101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

        // at the end of the year, we want to update classes
        //10 >> 11,   11 >> 12 ,  12 >> G
        //Create a method for this

         /*
        1) reach keys in a loop                                 //  101, 102, 103 ....
        2) by using keys reach value                            // Ali-Cem-10-H
        3) make an array for each element of the value          // [Ali, Cem, 10, H]
        4) reach class number by using the array                // 10
        5) if it is lower than 12, add 1. If it is 12, make it G
        6) make it a string value to save to the map            // Ali-Cem-11-H
        */

        MapsMethods.updateClassesEndOfTheYear(schoolMap);
        System.out.println(schoolMap);//{101=Ali-Cem-11-H, 102=Veli-Can-11-M, 103=Ali-Can-12-M, 104=Ayse-Cem-12-H, 105=Ayse-Han-11-H, 106=Veli-Han-11-H}

        MapsMethods.updateClassesEndOfTheYear(schoolMap);
        System.out.println(schoolMap);//{101=Ali-Cem-12-H, 102=Veli-Can-12-M, 103=Ali-Can-G-M, 104=Ayse-Cem-G-H, 105=Ayse-Han-12-H, 106=Veli-Han-12-H}

    }

    // HW: change surname of a student by using key
    // please change number 102 student's surname with brown

}
package day49_maps;

import java.util.HashMap;
import java.util.Map;
public class C01_Maps1 {

    public static void main(String[] args) {

        Map<Integer, String> schoolMap = new HashMap<>();

        schoolMap.put(101, "Ali-Cem-10-M");
        schoolMap.put(102,"Veli-Can-10-M");
        schoolMap.put(103,"Ali-Can-11-M");
        schoolMap.put(104,"Ayse-Cem-11-H");
        schoolMap.put(105,"Ayse-Han-10-H");
        schoolMap.put(106,"Veli-Han-10-H");

        System.out.println(schoolMap);//{101=Ali-Cem-10-M, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

        //we can print how many elements in the maps with the size()
        System.out.println(schoolMap.size());//6

        //print the keys
        System.out.println(schoolMap.keySet());//[101, 102, 103, 104, 105, 106]

        //print the values of the map
        System.out.println(schoolMap.values());//[Ali-Cem-10-M, Veli-Can-10-M, Ali-Can-11-M, Ayse-Cem-11-H, Ayse-Han-10-H, Veli-Han-10-H]

        //our map has 6 values
        System.out.println(schoolMap.values().size());//6
    }


}

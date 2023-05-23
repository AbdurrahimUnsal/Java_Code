package day49_maps;

import java.util.Arrays;
import java.util.Map;

public class C03_Map_Question2 {

    // we want to transfer all students from branch M to N

    public static void main(String[] args) {

        Map<Integer , String> schoolMap=MapsMethods.createExampleMap();
       // System.out.println(schoolMAp);//{101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

        //1) reach keys
        //2) Check the values if the branch is M
        //3) Change M with N
        //4) Prepare the value
        //5) update the map

        //1) reach keys

        for (Integer eachKey: schoolMap.keySet()){
            // Check the values if the branch is M
            //System.out.println(schoolMAp.get(eachKey));
        }

        String[] arr = schoolMap.get(eachKey).split("-");

        //2) Check the values if the branch is M
        //3) Change M with N
        if (arr[3].equalsIgnoreCase("m")){
            arr[3] = "N";
        }
     //   System.out.println(Arrays.toString(arr));

        //4) Prepare the value
        String value = " ";
        for (String each : arr){
            value = value + each +"-";
        }
   //     System.out.println(value);


    }
}

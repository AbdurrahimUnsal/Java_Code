package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapsMethods {

    public static void namesOfStudentsFromBranch(Map<Integer,String> schoolMap, String branch){

        for(String each: schoolMap.values()){
            String[] arr = each.split("-");
            if(arr[3].equalsIgnoreCase(branch)){
                System.out.println("name: " + arr[0] + ", surname: "+ arr[1]);
            }
        }
    }

    public static Map<Integer, String> createExampleMap(){
        Map<Integer,String> schoolMap = new HashMap<>();

        schoolMap.put(101,"Ali-Cem-10-H");//  [Ali, Cem, 10, H]
        schoolMap.put(102,"Veli-Can-10-M");
        schoolMap.put(103,"Ali-Can-11-M");
        schoolMap.put(104,"Ayse-Cem-11-H");
        schoolMap.put(105,"Ayse-Han-10-H");
        schoolMap.put(106,"Veli-Han-10-H");

        return schoolMap;
    }

    public static Map<Integer, String> updateBranch(Map<Integer, String > schoolMap, String oldBranch, String newBranch){

        // 1) reach keys
        // 2) check the values if the branch is M
        // 3) change M with N
        // 4) prepare the value
        // 5) update the map
        for(Integer eachKey: schoolMap.keySet()){
            //check the values if the branch is M
            //System.out.println(schoolMap.get(eachKey));
            String[] arr = schoolMap.get(eachKey).split("-"); //[Veli, Can, 10, M] //get(KEY) method gets the specific value of a key

            //2) Check the values if the branch is M
            //3) Change M with N

            if(arr[3].equalsIgnoreCase(oldBranch)){
                arr[3] = newBranch; //[Veli, Can, 10, N]
            }
//            System.out.println(Arrays.toString(arr));

            //4) Prepare the value
            String value = "";

            for(String each: arr){
                value = value + each + "-"; //Veli-Can-10-N-
            }
//            System.out.println(value);

            value = value.substring(0,value.length()-1);//Veli-Can-10-N

            //5) update the map
            schoolMap.put(eachKey,value);

        }

        return schoolMap;
    }

    public static Map<Integer, String> updateClassesEndOfTheYear(Map<Integer, String> schoolMap){

        /*
        1) reach keys in a loop                                 //  101, 102, 103 ....
        2) by using keys reach value                            // Ali-Cem-10-H
        3) make an array for each element of the value          // [Ali, Cem, 10, H]
        4) reach class number by using the array                // 10
        5) if it is lower than 12, add 1. If it is 12, make it G
        6) make it a string value to save to the map            // Ali-Cem-11-H
        */

        //1) reach keys in a loop
        for(Integer eachKey: schoolMap.keySet()){

//            2) by using keys reach value
//            3) make an array for each element of the value

            String[] arr = schoolMap.get(eachKey).split("-");
//            3) make an array for each element of the value          // [Ali, Cem, 10, H]
//            4) reach class number by using the array
//            5) if it is lower than 12, add 1. If it is 12, make it G
            Integer classNumber = Integer.parseInt(arr[2]);

            if (classNumber<12){
                classNumber++;
                arr[2]=classNumber + "";
            }else{
                arr[2] = "G";
            }

            // [Ali, Cem, 11, H]
//            6) make it a string value to save to the map

            String newValue = "";

            for(String each : arr){
                newValue += each + "-"; // Ali-Cem-11-H-
            }

            newValue = newValue.substring(0, newValue.length()-1);//Ali-Cem-11-H


            schoolMap.put(eachKey,newValue);


        }


        return schoolMap;
    }

}
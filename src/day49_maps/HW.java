package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class HW {
    /*
     // HW: change surname of a student by using key
    // please change number 102 student's surname with brown
     */
    public static void main(String[] args) {
        Map<Integer,String> schoolMap = new HashMap<>();

        schoolMap.put(101,"Ali-Cem-10-H");//  [Ali, Cem, 10, H]
        schoolMap.put(102,"Veli-Can-10-M");
        schoolMap.put(103,"Ali-Can-11-M");
        schoolMap.put(104,"Ayse-Cem-11-H");
        schoolMap.put(105,"Ayse-Han-10-H");
        schoolMap.put(106,"Veli-Han-10-H");
        // 1) change surname of a student by using key
        int studentNumber = 102;
        String newSurname = "Brown";
        String studentInfo = schoolMap.get(studentNumber);
        if (studentInfo != null){

            String[] parts = studentInfo.split("-");
            if (parts.length == 4){

                parts[1] = newSurname;
                studentInfo =String.join("-",parts);
                schoolMap.put(studentNumber,studentInfo);
                System.out.println("Chance the surname of student");
            }else {
                System.out.println("Information of fixed student: "+ studentInfo);
            }
        }else {

            System.out.println("Cannot found student");
        }
        System.out.println("New student list");
        for (Map.Entry<Integer,String> entry : schoolMap.entrySet()){

            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Student No: " + key + " , Information: "+ value)
            ;

            }

        }


    }


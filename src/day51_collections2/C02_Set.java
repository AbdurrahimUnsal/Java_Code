package day51_collections2;

import java.util.Set;
import java.util.TreeSet;

public class C02_Set {
    public static void main(String[] args) {

        //set stores unique elements
        //it does not support index structure and it does not follow any rule when ordering elements


        Set<String> students = new TreeSet<>();

        students.add("Duygu");
        students.add("Emre");
        students.add("Kerem");
        students.add("Burcu");
        students.add("Emre");

        System.out.println(students);//[Burcu, Duygu, Emre, Kerem]
        students.add("Ahmet");
        System.out.println(students);//[Ahmet, Burcu, Duygu, Emre, Kerem]
        students.add("Kerem");
        System.out.println(students);//[Ahmet, Burcu, Duygu, Emre, Kerem]

    }
}

package day52_collections3;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C01_HashSet {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(45);
        numbers.add(12);

        System.out.println(numbers); //[12, 45]

        Set<String> names  = new HashSet<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Deli");
        names.add("Celi");

        System.out.println(names);//[Celi, Veli, Deli, Ali]

        Set<String> names2  = new TreeSet<>();
        names2.add("Ali");
        names2.add("John");
        names2.add("Mike");
        names2.addAll(names);

        System.out.println(names2);//[Ali, Celi, Deli, John, Mike, Veli]

        //let's see which one is faster hashSet vs treeSet
        //we will try to create 2000 random numbers with both treeSet and hashset
        // we are going to scale time to see which one is faster

        Set<Integer> orderedSet = new TreeSet<>();
        Random rnd = new Random();
        int number;

        LocalTime hashStart = LocalTime.now();
        for(int i = 0; i<2000; i++){
            number = rnd.nextInt(20000000);
            numbers.add(number);
        }
        LocalTime hashFinish = LocalTime.now();

        LocalTime treeStart = LocalTime.now();
        for(int i = 0; i<2000; i++){
            number = rnd.nextInt(20000000);
            orderedSet.add(number);
        }
        LocalTime treeFinish = LocalTime.now();


        System.out.println("HashSet starting: "+ hashStart + " Finish: " + hashFinish);
        System.out.println("TreeSet starting: "+ treeStart + " Finish: " + treeFinish);

        System.out.println("hashSet : " + (hashFinish.getNano()-hashStart.getNano()));
        System.out.println("treeSet : " + (treeFinish.getNano()-treeStart.getNano()));

        //HAsh set is faster than treeSet





    }
}

package day51_collections2;

import java.util.HashSet;
import java.util.Set;

public class C03_NoRepeat {
    public static void main(String[] args) {

        // if we don't want to see any repeated elements in the array how can we do that
        // hint : use a set

        int [] arr = {3,4,5,3,2,3,4,5,2,3,4,5,2,3,4,5,3,2,4,3,2,4,3,5,3,4,2,3,4};
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            uniqueElements.add(num);
        }

        System.out.println("Unique elements in the array:");
        for (int uniqueNum : uniqueElements) {
            System.out.print(uniqueNum + " ");
        }
    }

    }


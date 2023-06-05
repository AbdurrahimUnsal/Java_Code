package day50_collections;

import java.util.LinkedList;
import java.util.List;

public class C02_LinkedListMethods {
    public static void main(String[] args) {

        //Let's create a linked list using List interface
        //Linked list is very effective for add and remove operations
        //However, it is very slow to reach the element

        List<String> letters = new LinkedList<>();
        System.out.println(letters);//[]

        letters.add("H");
        letters.add("K");
        letters.add("L");
        letters.add("M");

        System.out.println(letters); //[H, K, L, M] // a inked list is using nodes
        letters.add("B");
        System.out.println(letters);//[H, K, L, M, B] did not change the order of elements

        letters.add(3, "R");
        System.out.println(letters);//[H, K, L, R, M, B]

        List<String> symbols = new LinkedList<>();

        symbols.add("*");
        symbols.add("B");
        symbols.add("%");
        symbols.add("&");

        System.out.println(symbols);//[*, B, %, &]

        System.out.println(letters.removeAll(symbols));//true //if it is true that means It removed the common elements
        System.out.println(letters);//[H, K, L, R, M]
        System.out.println(symbols);//[*, B, %, &]

        System.out.println(letters.subList(2,4));//[L, R]
        System.out.println(letters);//[H, K, L, R, M]

        letters.add("B");

        //Please keep if you have any common elements with the symbols list

        System.out.println(letters);//[H, K, L, R, M, B]
        System.out.println(symbols);//[*, B, %, &]
        System.out.println(letters.retainAll(symbols));//true
        System.out.println(letters);//[B]
        System.out.println(symbols);//[*, B, %, &]

        System.out.println(letters.hashCode());//97
        letters.add("B");
        System.out.println(letters); //[B, B] Linked list allows having same element
        System.out.println(letters.hashCode());//3073


    }
}

package day50_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        //Queue is great for First one in first one out operations

        Queue<String> letters = new LinkedList<>();

        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("A");

        System.out.println(letters);//[A, B, C, A] // this is not "set", so we can add same elements more than once

        System.out.println(letters.remove());//A the data first in
        System.out.println(letters);//[B, C, A]

        //let's try to add an element to index 2
        //letters.add(2,"Z");  Because of queue structure we can only add elements to the end of the queue

        System.out.println(letters.remove());//B
        System.out.println(letters);//[C, A]

        letters.add("K");
        letters.add("L");
        System.out.println(letters); //[C, A, K, L]


        //element() method will return the first one in the que, but it won't remove it.
        System.out.println(letters.element());//C
        System.out.println(letters);//[C, A, K, L]

        //peek() method also returns the first element but doesn't delete it

        System.out.println(letters.peek());//C
        System.out.println(letters);//[C, A, K, L]

        // element() vs peek()
        Queue<String> letters2 = new LinkedList<>();//[]
        System.out.println(letters2.peek());// peek(0 method returns null for an empty linkedList
        //System.out.println(letters2.element());// element() method returns "NoSuchElementException" for an empty linkedList

        //remove() vs Poll() : Both deletes the first element

        //System.out.println(letters2.remove());// remove() method returns "NoSuchElementException" for an empty linkedList
        System.out.println(letters2.poll());//null

        System.out.println(letters.offer("*"));//true
        System.out.println(letters);//[C, A, K, L, *]




    }
}

package day51_collections2;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        //deque is double ended queue
        //an element can be added or removed from the both sides

        Deque<String> letters =new LinkedList<>();

        letters.add("J");
        letters.add("K");

        System.out.println(letters);//[J, K]

        letters.addFirst("B");
        System.out.println(letters);//[B, J, K]

        letters.addLast("B");
        System.out.println(letters);//B, J, K, B]

        letters.add("U");
        letters.add("H");
        letters.add("L");
        letters.addFirst("R");

        System.out.println(letters);//[R, B, J, K, B, U, H, L]

        letters.remove("B"); //it removes the first occurrence
        System.out.println(letters);//[R, J, K, B, U, H, L]

        System.out.println(letters.removeFirstOccurrence("z"));//false

        letters.add("Z");
        letters.addFirst("Z");
        System.out.println(letters);//[Z, R, J, K, B, U, H, L, Z]
        letters.removeFirstOccurrence("Z");
        System.out.println(letters);//[R, J, K, B, U, H, L, Z]

        letters.addFirst("Z");
        letters.removeLastOccurrence("Z");
        System.out.println(letters);//[Z, R, J, K, B, U, H, L]

        System.out.println(letters.peek());//Z
        System.out.println(letters.peekLast());//L
        System.out.println(letters.peekFirst());//Z


    }
}

package day30_arrayList3;
import day29_ArrayList2.C06_RemoveUnwantedElementMethod;

import java.util.ArrayList;
import java.util.List;
public class C01_CallingMethodFromAnotherClass {
    public static void main(String[] args) {

        //lets use delete method from day 29  page C06

        List<String> items = new ArrayList<>();

        items.add("Desk");
        items.add("Chair");
        items.add("Carpet");
        items.add("Painting");
        items.add("Computer");

        System.out.println(items);//[Desk, Chair, Carpet, Painting, Computer]
        //HomeWork: Create another list using the method from day29 C05

        String unwantedLetter = "a";

        System.out.println(C06_RemoveUnwantedElementMethod.deleteUnwantedElements(items, unwantedLetter));//[Desk, Computer]


    }
}

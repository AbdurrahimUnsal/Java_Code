package day52_collections3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_CollectionsQuestion {
    public static void main(String[] args) {
        //Create 2 lists by taking values from user and store them in lists. Then compare them
        //print the result like this:
        //List1 : ....
        //List2 : ....
        //common elements :
        // print the result when user press 0.otherwise continue to ask
        // Create a method that creates list from user

        List<String> list1 = createListFromUser();
//        System.out.println("++++++++++++++++++++++++++++++++++++");
        List<String> list2 = createListFromUser();

        System.out.println("List1 : " + list1);
        System.out.println("List2 : " + list2);

        list1.retainAll(list2); //after retain all list one will have only common elements
        System.out.println("Common elements: "+ list1);

    }

    public static List<String> createListFromUser () {

        Scanner scan = new Scanner(System.in);
        List<String> nameList = new LinkedList<>();
        String name = "";

        while(!name.equalsIgnoreCase("0")){
            System.out.println("Please enter a name for the list. Or press 0 to print the list");
            name = scan.next();

            if(!name.equalsIgnoreCase("0")){
                nameList.add(name);
            }
        }

        return nameList;
    }
}

package day29_ArrayList2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C05_TakeNamesFromUserMethod {
    // Create a method
    // it will take names from user and create a list from them
    //When user enters Q exit and print the list

    public static void main(String[] args) {

        System.out.println(creatingListFromUser());

    }

    public static List<String> creatingListFromUser(){

        //We will create the variable outside of the while loop
        Scanner scan = new Scanner(System.in);
        String enteredName = "";
        List<String> names = new ArrayList<>();

        while (!enteredName.equalsIgnoreCase("q")){
            System.out.println("Enter a name or press Q to print the list");
            enteredName = scan.next();

            if (!enteredName.equalsIgnoreCase("q")){
                names.add(enteredName);
            }
        }

        return names;


    }
}

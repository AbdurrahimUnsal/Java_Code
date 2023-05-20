package day29_ArrayList2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C06_RemoveUnwantedElementMethod {
    // Question 3- Create a method that deletes the elements containing unwanted letters in a given String list
    // and returns the remaining part to us as a list.


    public static void main(String[] args) {

        List<String> list = C05_TakeNamesFromUserMethod.creatingListFromUser();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter unwanted letter");
        String unwantedLetter = scan.next();

        List<String> updatedList = deleteUnwantedElements(list, unwantedLetter);

        System.out.println(updatedList);

    }

    public static List<String> deleteUnwantedElements(List<String> list, String unwantedLetter) {

        List<String> perfectlist = new ArrayList<>();

        //we should not mess with the size of the method when we are using loops

        for (int i = 0; i < list.size(); i++) {

            if (!list.get(i).contains(unwantedLetter)){
                perfectlist.add(list.get(i));
            }

        }


        return perfectlist;
    }
}

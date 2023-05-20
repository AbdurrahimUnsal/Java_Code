package day31_arrayList_foreachloop;
import java.util.Arrays;
public class C04_FindingNumberOfUsedLetter {
    //Question 4- Take a sentence and a letter from the user,
    // print how many times the letter is used in the sentence,


    public static void main(String[] args) {

        String givenSentence = "We should work hard to learn java and to get paid higher";
        String letterToCheck = "o";

        String[] characterArray = givenSentence.split("");
        System.out.println(Arrays.toString(characterArray)); //[W, e,  , s, h, o, u, l, d,  , w, o, r, k,  , h, a, r, d,  , t, o,  , g, e, t,  , p, a, i, d]

        int counter = 0;
        for(String w : characterArray){
            if(w.equals(letterToCheck)){
                counter++;
            }
        }

        System.out.println("amount of letter "  + letterToCheck + " is " + counter);


    }
}

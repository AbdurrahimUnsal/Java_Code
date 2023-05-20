package day27_ArraysAndMDA;
import java.util.Arrays;
public class C03_SplitMethod {
    public static void main(String[] args) {
        String str = "Java is the life";

        //How many characters in the string
        System.out.println(str.length());//16

        //how many words are in the string

        String[] strArray = str.split(" "); //split() method returns an array

        System.out.println(Arrays.toString(strArray));//[Java, is, the, life]

        System.out.println(strArray[0]);//Java

        System.out.println(strArray.length);//4

        //homework: What is the longest word in the string


        String str2  = "Fenerbahce is not good for health";
        String [] str2Array=str2.split(" ");
        System.out.println(Arrays.toString(str2Array));//[Fenerbahce, is, not, good, for, health]

        System.out.println(Arrays.toString(str2.split("")));//[F, e, n, e, r, b, a, h, c, e,  , i, s,  , n, o, t,  , g, o, o, d,  , f, o, r,  , h, e, a, l, t, h]

    }
}

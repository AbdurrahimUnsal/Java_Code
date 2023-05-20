package day29_ArrayList2;
import java.util.ArrayList;
import java.util.List;
public class C04_IndexOf_LastIndexOf {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Esra");
        names.add("Mohammad");
        names.add("Bahadir");
        names.add("Kaan");
        names.add("Bahadir");
        names.add("Seda");


        System.out.println(names);//[Esra, Mohammad, Bahadir, Kaan, Bahadir, Seda]

        //print element index 4
        System.out.println(names.get(4));//Bahadir


        //IndexOf() method returns the index of first occurrence
        System.out.println(names.indexOf("Bahadir"));//2

        System.out.println(names.indexOf("Kaan"));//3
        System.out.println(names.lastIndexOf("Kaan"));//3

        System.out.println(names.indexOf("Seda"));//5

        //lastIndexOf() methods the index of last occurrence
        System.out.println(names.lastIndexOf("Bahadir"));//4

        //When indexOf() == lastIndexOf means element used once in the list
        //When indexOf() != lastIndexOf means element used more than once in the list

    }
}

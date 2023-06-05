package Interview_01;

import java.util.ArrayList;
import java.util.List;

public class Iterator_231 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Halid");
        names.add("Nukhet");
        names.add("Nimet");
        names.add("Salih");
        names.add("Furkan");
        names.add("Merve");
        names.add("Zeynep");
        names.add("Yakup");


        removeNames(names);

        System.out.println("Updated list:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void removeNames(List<String> names) {
        names.removeIf(name -> name.length() > 5);
    }
    }


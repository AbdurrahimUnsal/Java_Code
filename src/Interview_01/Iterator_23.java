package Interview_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterator_23 {

    public static void main(String[] args) {


        String[] str = {"Halid", "Nukhet", "Nimet", "Salih", "Furkan", "Merve", "Zeynep", "Yakup"};

        List<String> names = new ArrayList<>(Arrays.asList(str));

        // Lets erase names if length > 5

    }

    // Can we do it without the iterator?

    // Can I use remove() method?
    public  static List<String> removeGreaterThanFive(List<String> names){
        names.removeIf(name -> name.length() > 5);
        return names;

    }


    }


package CodingBat_Practice.AP_1;

import java.util.ArrayList;
import java.util.List;

public class wordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() != len)
                list.add(words[i]);
        }

        return list;
    }
}

package CodingBat_Practice.Map_2;

import java.util.HashMap;
import java.util.Map;

public class wordLen {
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }
}

package CodingBat_Practice.Warmup_2;

import java.util.HashMap;
import java.util.Map;

public class wordLen {
    public static Map<String, Integer> main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String[] strings = new String[0];
        for (String str : strings) {
            map.put(str, str.length());
        }
        return map;
    }

}

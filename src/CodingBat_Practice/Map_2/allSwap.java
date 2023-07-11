package CodingBat_Practice.Map_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class allSwap {
    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap();
        String[] str = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i].charAt(0) + "")) {
                // chagne
                str[map.get(strings[i].charAt(0) + "")] = strings[i];
                str[i] = strings[map.get(strings[i].charAt(0) + "")];
                // and
                // remove
                map.remove(strings[i].charAt(0) + "");
            }
            else {
                map.put(strings[i].charAt(0) + "", i);
                str[i] = strings[i];
            }
        }

        return str;
    }
}

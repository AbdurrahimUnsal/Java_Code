package CodingBat_Practice.Functional2;

import java.util.List;

public class no34 {
    public List<String> no34(List<String> strings) {
        strings.removeIf(s -> s.length() == 3 || s.length() == 4);
        return strings;
    }
}

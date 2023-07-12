package CodingBat_Practice.Functional2;

import java.util.List;

public class noLong {
    public List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }
}

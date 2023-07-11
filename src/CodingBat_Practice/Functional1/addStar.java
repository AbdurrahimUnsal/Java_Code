package CodingBat_Practice.Functional1;

import java.util.List;

public class addStar {
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s+"*");
        return strings;
    }
}

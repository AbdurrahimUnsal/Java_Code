package CodingBat_Practice.Functional2;

import java.util.List;
import java.util.stream.Collectors;

public class noYY {
    public List<String> noYY(List<String> strings) {
        strings = strings.stream()
                .map(s -> s + "y")
                // .removeIf(s -> s.contains("yy"))
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
        return strings;
    }
}

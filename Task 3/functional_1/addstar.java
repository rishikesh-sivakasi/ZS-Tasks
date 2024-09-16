package functional_1;

import java.util.List;

public class addstar {
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n+"*");
        return strings;
    }
}

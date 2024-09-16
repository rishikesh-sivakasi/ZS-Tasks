package functional_1;

import java.util.List;

public class copythree {
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(n -> n+n+n);
        return strings;
    }
}

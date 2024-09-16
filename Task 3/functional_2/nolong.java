package functional_2;

import java.util.List;

public class nolong {
    public List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length()>=4);
        return strings;
    }
}

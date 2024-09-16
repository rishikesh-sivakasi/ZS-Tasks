package functional_2;

import java.util.List;

public class noz {
    public List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }
}

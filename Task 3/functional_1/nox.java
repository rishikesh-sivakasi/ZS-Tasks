package functional_1;

import java.util.List;

public class nox {
    public List<String> noX(List<String> strings) {
        strings.replaceAll(n->n.replaceAll("x",""));
        return strings;
    }
}

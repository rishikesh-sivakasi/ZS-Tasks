package functional_2;

import java.util.List;

public class no3and4 {
    public List<String> no34(List<String> strings) {
        strings.removeIf(n -> n.length()==3 || n.length()==4);
        return strings;
    }
}

package functional_1;

import java.util.List;

public class morey {
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y"+n+"y");
        return strings;
    }
}

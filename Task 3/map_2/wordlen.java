package map_2;

import java.util.HashMap;
import java.util.Map;

public class wordlen {
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String a : strings)
        {
            map.put(a,a.length());
        }
        return map;
    }
}

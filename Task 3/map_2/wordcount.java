package map_2;

import java.util.HashMap;
import java.util.Map;

public class wordcount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String a : strings)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        return map;
    }
}

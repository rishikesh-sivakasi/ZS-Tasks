package map_2;

import java.util.HashMap;
import java.util.Map;

public class words0 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String a : strings)
        {
            map.put(a,0);
        }
        return map;
    }
}

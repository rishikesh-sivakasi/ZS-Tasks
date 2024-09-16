package map_2;

import java.util.HashMap;
import java.util.Map;

public class pair {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String a : strings)
        {
            map.put(a.charAt(0)+"",a.charAt(a.length()-1)+"");
        }
        return map;
    }
}

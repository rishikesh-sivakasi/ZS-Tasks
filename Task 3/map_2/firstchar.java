package map_2;

import java.util.HashMap;
import java.util.Map;

public class firstchar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String a : strings)
        {
            String t = a.charAt(0)+"";
            if(map.containsKey(t))
            map.put(t,map.get(t)+a);
            else
            map.put(t,a);
        }
        return map;
    }
}

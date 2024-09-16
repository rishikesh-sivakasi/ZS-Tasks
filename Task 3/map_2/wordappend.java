package map_2;

import java.util.HashMap;
import java.util.Map;

public class wordappend {
    public String wordAppend(String[] strings) {
        String r = new String();
        Map<String,Integer> map = new HashMap<>();
        for(String a : strings)
        {
            map.put(a,map.getOrDefault(a,0)+1);
            if(map.get(a)%2==0)
            r = r + a;
        }
        return r;
    }
}

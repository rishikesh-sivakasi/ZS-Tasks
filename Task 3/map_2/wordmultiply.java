package map_2;

import java.util.HashMap;
import java.util.Map;

public class wordmultiply {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> res = new HashMap<>();
        Map<String,Integer> map = new HashMap<>();
        for(String a : strings)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        map.forEach((key,value)->{
            if(value>=2)
            res.put(key,true);
            else
            res.put(key,false);
        });
        return res;
    }
}

package map_2;

import java.util.HashMap;
import java.util.Map;

public class allswap {
    public String[] allSwap(String[] strings) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<strings.length;i++)
        {
            char t = strings[i].charAt(0);
            if(map.containsKey(t))
            {
            String a = strings[map.get(t)] ;
            strings[map.get(t)] = strings[i];
            strings[i] = a;
            map.remove(t);
            }
            else
            map.put(t,i);
        }
        return strings;
    }

}

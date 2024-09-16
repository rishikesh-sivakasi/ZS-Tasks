package map_2;
import java.util.*;
public class firstswap {
    public String[] firstSwap(String[] strings) {
        Map<Character,Integer> o = new HashMap<>();
        Map<Character,Integer> ii = new HashMap<>();
        for(int i=0;i<strings.length;i++)
        {
          char t = strings[i].charAt(0);
          o.put(t,o.getOrDefault(t,0)+1);
          if(o.get(t)==2)
          {
            String a = strings[i];
            strings[i] = strings[ii.get(t)];
            strings[ii.get(t)] = a;
          }
          ii.put(t,i);
        }
        return strings;
      }      
}

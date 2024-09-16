package ap_1;
import java.util.*;

public class wordswithout {
    public String[] wordsWithout(String[] words, String target) {
        String[] a = new String[words.length];
        int i=0;
        for(String t : words)
        {
          if(!t.equals(target))
            a[i++] = t;
        }
        return Arrays.copyOfRange(a,0,i);
      }      
}

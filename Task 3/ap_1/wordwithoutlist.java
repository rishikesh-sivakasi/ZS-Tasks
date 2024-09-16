package ap_1;
import java.util.*;
public class wordwithoutlist {
    public List<String> wordsWithoutList(String[] words, int len) {
        List<String> t = new ArrayList<>();
        for(String a : words)
        {
            if(a.length()!=len)
              t.add(a);
        }
        return t;
      }
      
}

package ap_1;

public class wordscount {
    public int wordsCount(String[] words, int len) {
        int c = 0;
        for(String a : words)
        {
          c = a.length()==len ? c+1 : c;
        }
        return c;
      }      
}

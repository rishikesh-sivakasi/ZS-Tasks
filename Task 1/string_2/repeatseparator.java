package string_2;

public class repeatseparator {
    public String repeatSeparator(String word, String sep, int count) {
        String r = new String();
        for(int i=0; i<count; i++)
        {
          if(i!=0)
            r = r + sep + word;
          else
           r = r + word;
        }
        return r;
      }      
}

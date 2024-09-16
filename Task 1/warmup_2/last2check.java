package warmup_2;

public class last2check {
    public int last2(String str) {
        int c=0;
        if(str.length()<2)
          return 0;
        String l = str.substring(str.length()-2);
        for(int i=0;i<str.length()-2;i++)
        {
          if(str.substring(i,i+2).equals(l))
            c++;
        }
        return c;
      }      
}

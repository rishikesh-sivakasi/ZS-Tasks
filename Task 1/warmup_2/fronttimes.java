package warmup_2;

public class fronttimes {
    public String frontTimes(String str, int n) {
        String t = new String();
        for(int i=1;i<=n;i++)
        {
          if(str.length()>=3)
            t = t + str.substring(0,3);
          else
            t = t + str;
        }
        return t;
      }      
}

package warmup_2;

public class stringtimes {
    public String stringTimes(String str, int n) {
        String t = new String();
        for(int i=1;i<=n;i++)
        {
          t = t + str;
        }
        return t;
      }
      
}

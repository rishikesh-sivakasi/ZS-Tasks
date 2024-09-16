package warmup_2;

public class stringsplosion {
    public String stringSplosion(String str) {
        String t = new String();
        for(int i=1;i<=str.length();i++)
        {
          t = t + str.substring(0,i);
        }
        return t;
      }      
}

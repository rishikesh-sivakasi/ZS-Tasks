package warmup_2;

public class stringmatch {
    public int stringMatch(String a, String b) {
        int n = a.length() > b.length() ? b.length() : a.length(); 
        int c = 0;
        for(int i=0,j=2;j<=n;i++,j++)
        {
          if(a.substring(i,j).equals(b.substring(i,j)))
            c++;
        }
        return c;
      }      
}

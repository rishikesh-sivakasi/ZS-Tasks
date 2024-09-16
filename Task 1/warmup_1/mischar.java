public class mischar {
    public String missingChar(String str, int n) {
        String t = new String();
        for(int i=0;i<str.length();i++)
        {
          if(i==n)
            continue;
          else
            t = t + str.charAt(i);
        }
        return t;
      }      
}

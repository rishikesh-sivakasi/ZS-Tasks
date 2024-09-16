package string_2;

public class mixstring {
    public String mixString(String a, String b) {
        String result = new String();
        int n = a.length()>b.length()? a.length() : b.length();
        for(int i=0,j=0;i<n;i++)
        {
          if(a.length()-1>=i && b.length()-1>=i)
          {
            result = result + a.charAt(j) + b.charAt(j);
            j++;
          }
          else if(a.length()-1>=i && b.length()-1<i)
          {
            result = result + a.charAt(j);
            j++;
          }
          else if(a.length()-1<i && b.length()-1>=i)
          {
            result = result + b.charAt(j);
            j++;
          }
        }
        return result;
      }      
}

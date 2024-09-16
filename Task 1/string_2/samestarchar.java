package string_2;

public class samestarchar {
    public boolean sameStarChar(String str) {
        boolean t = false;
        int s=0;
        if(str.length()<=2)
          return true;
        for(int i=1;i<str.length()-1;i++)
        {
          if(str.charAt(i)=='*' && str.charAt(i-1)==str.charAt(i+1))
          {
            s++;
            t = true;
          }
          else if(str.charAt(i)=='*' && str.charAt(i-1)!=str.charAt(i+1))
          {
            t = false;
            s++;
          }
        }
        return s==0 || t;
      }      
}

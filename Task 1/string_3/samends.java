package string_3;

public class samends {
    public String sameEnds(String string) {
        int l = 0 , r = 0;
        if(string.length()%2==0)
        {
          l = string.length()/2;
          r = l;
        }
        else
        {
          l = (string.length()/2);
          r = (string.length()/2)+1;
        }
        while(l>=0 && r <= string.length()-1)
        {
          if(string.substring(0,l).equals(string.substring(r)))
            return string.substring(r);
          else
          {
            l--;
            r++;
          }
        }
        return "";
      }      
}

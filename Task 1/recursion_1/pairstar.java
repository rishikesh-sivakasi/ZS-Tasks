package recursion_1;

public class pairstar {
    public String pairStar(String str) {
        if(str.length()<=1)
          return str;
        else
        {
          if(str.charAt(0)==str.charAt(1))
            return str.charAt(0) + "*" + pairStar(str.substring(1));
          return str.charAt(0) + pairStar(str.substring(1));
        }
      }      
}

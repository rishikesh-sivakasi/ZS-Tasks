package string_2;

public class xyzthere {
    public boolean xyzThere(String str) {
        boolean t = false;
        for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)=='.' && i+3<=str.length()-1 && str.substring(i+1,i+4).equals("xyz"))
          {
            t = false;
            i = i+3;
          }
          if(str.charAt(i)=='x' && i+2<=str.length()-1 && str.substring(i,i+3).equals("xyz"))
            t = true;
        }
        return t;
      }      
}

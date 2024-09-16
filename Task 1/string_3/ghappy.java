package string_3;

public class ghappy {
    public boolean gHappy(String str) {
        for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)=='g' && i+1<=str.length()-1 && str.charAt(i+1)=='g')
            i++;
          else if(str.charAt(i)=='g' && i-1<0)
            return false;
          else if(str.charAt(i)=='g' && i+1<=str.length()-1 && str.charAt(i+1)!='g' && str.charAt(i-1)=='g')
            continue;
          else if(str.charAt(i)=='g' && i+1<=str.length()-1 && str.charAt(i+1)!='g' && str.charAt(i-1)!='g')
            return false;
          else if(str.charAt(i)=='g' && i+1>str.length()-1  && str.charAt(i-1)!='g')
            return false;
        }
        return true;
      }
}

package string_3;

public class notreplace {
    public String notReplace(String str) {
        String r = new String();
        for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)=='i' && i-1>=0 && !Character.isLetter(str.charAt(i-1)) && i+1<=str.length()-1 && str.charAt(i+1)=='s')
          {
            if(i+2<=str.length()-1) 
            {
              if(!Character.isLetter(str.charAt(i+2)))
              {
                r = r + "is not";
                i++;
              }
              else
                r = r + str.charAt(i);
            }
            else
            {
              r = r + "is not";
              i++;
            }
          }
          else if(str.charAt(i)=='i' && i==0 && i+1<=str.length()-1 && str.charAt(i+1)=='s')
          {
            if(i+2<=str.length()-1) 
            {
              if(!Character.isLetter(str.charAt(i+2)))
              {
                r = r + "is not";
                i++;
              }
              else
                r = r + str.charAt(i);
            }
            else
            {
              r = r + "is not";
              i++;
            }
          }
          else
            r = r + str.charAt(i);
        }
        return r;
      }      
}

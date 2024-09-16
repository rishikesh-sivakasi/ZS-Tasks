package string_3;

public class sumnumbers {
    public int sumNumbers(String str) {
        int s = 0 , t = 0 , j = 0 ;
        for(int i=0;i<str.length();i++)
        {
          if(Character.isDigit(str.charAt(i)))
          {
            t = (t * 10) + Integer.parseInt(str.charAt(i)+"");
            for(j=i+1;j<str.length();j++)
            {
              if(Character.isDigit(str.charAt(j)))
                t = (t * 10) + Integer.parseInt(str.charAt(j)+"");
              else 
                break;
            }
            s += t;
            i=j-1;
            t=0;
          }
        }
        return s;
      }      
}

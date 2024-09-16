package string_3;

public class mirrorends {
    public String mirrorEnds(String string) {
        int i = 0 , j = string.length()-1;
        while(i<j)
        {
          if(string.charAt(i)!=string.charAt(j))
            return string.substring(0,i);
          else
          {
            i++;
            j--;
          }
        }
        return string;
      }      
}

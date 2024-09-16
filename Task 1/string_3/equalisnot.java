package string_3;

public class equalisnot {
    public boolean equalIsNot(String str) {
        int is = 0 , n = 0;
        for(int i=0;i<str.length();i++)
        {
          if(i+1<=str.length()-1 && str.substring(i,i+2).equals("is"))
            is++;
          else if(i+2<=str.length()-1 && str.substring(i,i+3).equals("not"))
            n++;
        }
        return is == n;
      }      
}

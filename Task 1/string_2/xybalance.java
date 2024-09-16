package string_2;

public class xybalance {
    public boolean xyBalance(String str) {
        int c = 0;
        for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)=='x')
            c = 1;
          else if(str.charAt(i)=='y')
            c = 0;
        }
        return c==0;
      }      
}

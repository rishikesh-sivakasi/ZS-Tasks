package recursion_1;

public class counthi2 {
    public int countHi2(String str) {
        if(str.length()<=1)
          return 0;
        else
        {
          if(str.charAt(0)=='x' && str.charAt(1)=='h')
            return countHi2(str.substring(2));
          else if(str.substring(0,2).equals("hi"))
            return 1 + countHi2(str.substring(2));
          return countHi2(str.substring(1));
        }
      }      
}

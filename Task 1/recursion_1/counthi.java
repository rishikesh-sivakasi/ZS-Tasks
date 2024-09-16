package recursion_1;

public class counthi {
    public int countHi(String str) {
        if(str.length()<=1)
          return 0;
        else
        {
          if(str.substring(str.length()-2).equals("hi"))
            return 1 + countHi(str.substring(0,str.length()-1));
          return countHi(str.substring(0,str.length()-1));
        }
      }      
}

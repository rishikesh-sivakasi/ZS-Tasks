package recursion_1;

public class countx {
    public int countX(String str) {
        if(str.length()==0)
          return 0;
        else
        {
          if(str.charAt(str.length()-1)=='x')
            return 1 + countX(str.substring(0,str.length()-1));
          return countX(str.substring(0,str.length()-1));
        }
      }      
}

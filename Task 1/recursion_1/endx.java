package recursion_1;

public class endx {
    public String endX(String str) {
        if(str.isEmpty())
          return "";
        else
        {
          if(str.charAt(0)=='x')
            return endX(str.substring(1)) + 'x';
          return str.charAt(0) + endX(str.substring(1));
        }
      }      
}

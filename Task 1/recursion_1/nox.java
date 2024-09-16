package recursion_1;

public class nox {
    public String noX(String str) {
        if(str.length()<1)
          return "";
        else if(str.charAt(0)!='x')
          return str.charAt(0) + noX(str.substring(1));
        return "" +  noX(str.substring(1));
      }      
}

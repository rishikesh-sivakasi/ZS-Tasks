package string_1;

public class hasbad {
    public boolean hasBad(String str) {
        if(str.length()<3 || (str.length()==3 && str.charAt(0)!='b'))
          return false;
        return str.charAt(0)=='b'?str.substring(0,3).equals("bad") : str.substring(1,4).equals("bad");
      }      
}

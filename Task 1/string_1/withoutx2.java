package string_1;

public class withoutx2 {
    public String withoutX2(String str) {
        if(str.length()==1)
          return str.charAt(0)=='x' ? "" : str ;
        else if(str.length()>=2)
        {
          if(str.charAt(0)=='x' && str.charAt(1)=='x')
            return str.substring(2);
          else if(str.charAt(0)=='x' && str.charAt(1)!='x')
            return str.substring(1);
          else if(str.charAt(0)!='x' && str.charAt(1)=='x')
            return str.charAt(0)+str.substring(2);
        }
          return str;
      }      
}

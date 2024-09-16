package string_1;

public class withoutx {
    public String withoutX(String str) {
        if(str.length()==1)
          return str.charAt(0)=='x' ? "" : str;
        else if(str.length()>=2)
        {
          if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x')
            return str.substring(1,str.length()-1);
          else if(str.charAt(0)=='x' && str.charAt(str.length()-1)!='x')
            return str.substring(1);
          else if(str.charAt(0)!='x' && str.charAt(str.length()-1)=='x')
            return str.substring(0,str.length()-1);
        }
        return str;
    }      
}

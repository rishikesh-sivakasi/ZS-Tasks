package string_1;

public class concat {
    public String conCat(String a, String b) {
        if( a.length()>=2 && b.length()>=2)
        {
           if(a.charAt(a.length()-1)==b.charAt(0))
             return a+b.substring(1);
        }
        else if(a.length()==1 || b.length()==1)
        {
          if(a.charAt(a.length()-1) == b.charAt(0))
           return a;
        }
        return a+b;
       }       
}
